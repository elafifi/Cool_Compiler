package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

/*
classDefinition :
    CLASS TYPE (INHERITS TYPE)? LEFT_CURLY
        classBody
    RIGHT_CURLY SEMICOLUN
    ;
 */
public class ClassDefinitionTranslator extends Translator {
    public ClassDefinitionTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.ClassDefinitionContext.class);
    }

    @Override
    public Temp gen() {
        TranslatorHandler.write(" --=========================\n" +
                "---------> ClassDefinitionStmt_Start <-----------\n" +
                " --=========================\n");

        ScopeHandler.pushScope();

        String className = parseTree.getChild(1).getText();
        TranslatorHandler.write(
            String.format("%s: ", className)
        );
        ParseTree classBody = parseTree.getChild(parseTree.getChildCount() - 3);
        new ClassBodyTranslator(classBody).gen();

        ScopeHandler.popScope();

        TranslatorHandler.write(" --=========================\n" +
                "---------> ClassDefinitionStmt_End <-----------\n" +
                " --=========================\n");

        return null;
    }


}
