
import translation.TranslatorHandler;

import java.io.FileOutputStream;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
        String srcFile = "good.cl";
        if (args.length >= 1) srcFile = args[0];

        Lexer_IO lexer = new Lexer_IO(srcFile);
        lexer.writeTokens(srcFile + "-lex");

        Parser_IO parser = new Parser_IO(lexer);
        //parser.writeCST(srcFile + "-cst");



        TranslatorHandler.setStream(new FileOutputStream(srcFile + "-TAC"));
        TranslatorHandler.translate(parser.getParser());


    }
}