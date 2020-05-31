package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Env.Symbol;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

import java.util.HashSet;
import java.util.Set;

/*
caseStmt : CASE expr OF caseBody+ ESAC;
caseBody : ID COLUN TYPE CASE_ARROW expr;
 */
public class CaseStmtTranslator extends Translator {
    public CaseStmtTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.CaseStmtContext.class);
    }
    Set<String> takenTypes = new HashSet<String>();
    @Override
    public Temp gen() {

        TranslatorHandler.write(" --=========================\n" +
                "---------> CaseStmt_Start <-----------\n" +
                " --=========================\n");

        Temp caseExprTemp = new ExprTranslator(parseTree.getChild(1)).gen();

        Temp caseExprTypeTemp = new Temp();
        Temp resTemp = new Temp();

        TranslatorHandler.write(
                String.format("%s := TYPEOF %s", caseExprTypeTemp, caseExprTemp)
        );
        for (int i = 0; i < parseTree.getChildCount(); i++) {
            if (parseTree.getChild(i) instanceof Cool_compilerParser.CaseBodyContext) {
                ScopeHandler.pushScope();
                String nextLabel = TranslatorHandler.getNewLabel();
                ParseTree caseBody = parseTree.getChild(i);

                String varName = caseBody.getChild(0).getText();
                String type = caseBody.getChild(2).getText();
                if (takenTypes.contains(type)) {
                    throw new RuntimeException(
                            String.format("Case branch type %s is found twice", type)
                    );
                } else {
                    takenTypes.add(type);
                }
                TranslatorHandler.write(
                        String.format("IFZ %s == %s GOTO %s", type, caseExprTypeTemp, nextLabel)
                );

                Symbol symbol = new Symbol(varName, type);
                ScopeHandler.addSymbol(symbol);

                Temp exprTemp = new ExprTranslator(caseBody.getChild(4)).gen();
                TranslatorHandler.write(
                        String.format("%s := %s", resTemp, exprTemp)
                );

                ScopeHandler.popScope();
                TranslatorHandler.write(
                        String.format("%s: ",nextLabel)
                );
            }

        }

        TranslatorHandler.write(" --=========================\n" +
                "---------> CaseStmt_End <-----------\n" +
                " --=========================\n");

        return resTemp;
    }
}
