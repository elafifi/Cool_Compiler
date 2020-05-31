package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

public class ExprTranslator extends Translator {

    public ExprTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.ExprContext.class);
    }

    @Override
    public Temp gen() {

        if(parseTree.getChildCount() == 1) {
            ParseTree child = parseTree.getChild(0);

            if (child instanceof Cool_compilerParser.ValueContext) {
                return new ValueTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.BlockStmtContext) {
                return new BlockStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.MethodCallContext) {
                return new MethodCallTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.LetStmtContext) {
                return new LetStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.WhileStmtContext) {
                return new WhileStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.IfStmtContext) {
                return new IfStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.AssignmentStmtContext) {
                return new AssignmentStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.InvExprStmtContext) {
                return new InvExprStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.NotExprStmtContext) {
                return new NotExprStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.NewObjStmtContext) {
                // TODO : call newObjectTranslator
            } else if (child instanceof Cool_compilerParser.IsvoidStmtContext) {
                return new IsvoidStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.CaseStmtContext) {
                return new CaseStmtTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.Feature_access_stmtContext) {
                // TODO : call featureAccessStmtTranslator
            } else {
                throw new RuntimeException( child.getClass() + "is unknown class");
            }
        } else if (parseTree.getChildCount() == 3) {

            if (parseTree instanceof Cool_compilerParser.BracExprStmtContext) {
                return new BracExprStmtTranslator(parseTree).gen();
            }
            ParseTree expr1 = parseTree.getChild(0);
            Temp expr1_temp = new ExprTranslator(expr1).gen();
            String op = parseTree.getChild(1).getText();
            Temp expr2_temp = new ExprTranslator(parseTree.getChild(2)).gen();

            Temp resTemp = new Temp();

            TranslatorHandler.write(
                    String.format(
                            "%s := %s %s %s",
                            resTemp,
                            expr1_temp,
                            op,
                            expr2_temp
                    )
            );
            return resTemp;
        }

        return null;

    }
}
