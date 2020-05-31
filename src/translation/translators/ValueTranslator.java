package translation.translators;

import gen.Cool_compilerLexer;
import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import translation.Env.ScopeHandler;
import translation.Env.Symbol;
import translation.Temp;
import translation.Translator;

public class ValueTranslator extends Translator {
    public ValueTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.ValueContext.class);
    }

    @Override
    public Temp gen() {
            int tokenType = ((TerminalNodeImpl)parseTree.getChild(0)).symbol.getType() - 1;
            String tokenName = Cool_compilerLexer.ruleNames[tokenType];

            if (tokenName.equals("ID")) {
                Symbol symbol = ScopeHandler.getSymbol(parseTree.getChild(0).getText());
                return new Temp(symbol);
            } else {
                return new Temp(parseTree.getChild(0).getText());
            }
    }

}

