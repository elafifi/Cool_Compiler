package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Env.Symbol;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

//assignmentStmt : ID ASSIGN_OPERATOR expr;
public class AssignmentStmtTranslator extends Translator {

    public AssignmentStmtTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.AssignmentStmtContext.class);
    }

    @Override
    public Temp gen() {

        String id = this.getParseTree().getChild(0).getText();
        Symbol symbol = ScopeHandler.getSymbol(id);

        Temp exprTemp = new ExprTranslator(parseTree.getChild(2)).gen();

        TranslatorHandler.write(
                String.format(
                        "%s := %s",
                        symbol.getName(),
                        exprTemp
                )
        );



        return exprTemp;
    }
}
