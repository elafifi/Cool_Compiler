
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String srcFile = "good.cl";
        if (args.length >= 1) srcFile = args[0];

        Lexer_IO lexer = new Lexer_IO(srcFile);
        lexer.writeTokens(srcFile + "-lex");

        Parser_IO parser = new Parser_IO(lexer);
        parser.writeCST(srcFile + "-cst");

        Cool_compilerBaseVisitor<Integer> coolVisitor = new Cool_compilerBaseVisitor();
        coolVisitor.visit(new Cool_compilerParser(lexer.getTokensStream()).program());
    }
}