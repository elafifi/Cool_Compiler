package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

public class IsvoidStmtTranslator extends Translator {
    public IsvoidStmtTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.IsvoidStmtContext.class);
    }

    @Override
    public Temp gen() {

        Temp exprTemp = new ExprTranslator(parseTree.getChild(1)).gen();
        String op = parseTree.getChild(0).getText();
        Temp resTemp = new Temp();

        TranslatorHandler.write(
                String.format("%s := %s %s", resTemp, op, exprTemp)
        );

        return resTemp;

    }
}
