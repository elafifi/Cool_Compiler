package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

//actualParamList : expr (COMMA expr)*;
public class ActualParamListTranslator extends Translator {
    public ActualParamListTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.ActualParamListContext.class);
    }

    @Override
    public Temp gen() {

        for (int i = 0; i < parseTree.getChildCount(); i++) {
            ParseTree child = parseTree.getChild(i);
            if (child instanceof Cool_compilerParser.ExprContext) {
                Temp paramTemp = new ExprTranslator(child).gen();

                TranslatorHandler.write(
                        String.format(
                                "PushParam %s",
                                paramTemp
                        )
                );
            }
        }

        return null;
    }
}
