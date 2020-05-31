package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Temp;
import translation.Translator;

//classBody : ((varDefinition | methodDefinition) SEMICOLUN)*;
public class ClassBodyTranslator extends Translator {

    public ClassBodyTranslator(ParseTree parseTree) {
            super(parseTree, Cool_compilerParser.ClassBodyContext.class);
    }

    @Override
    public Temp gen() {

        ScopeHandler.pushScope();

        for (int i = 0; i < parseTree.getChildCount(); i++) {
            ParseTree child  = parseTree.getChild(i);

            if (child instanceof Cool_compilerParser.VarDefinitionContext) {
                new VarDefinitionTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.MethodDefinitionContext) {
                new MethodDefinitionTranslator(child).gen();
            }
        }

        ScopeHandler.popScope();



        return null;
    }
}
