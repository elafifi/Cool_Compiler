
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * this {@link Parser_IO} purpose is to manipulate among coolParser , lexer and output file
 */
public class Parser_IO {

    private Cool_compilerParser coolParser;

    /**
     * class constructor used to instantiate object from coolParser and add Error Listener to it.
     *
     * @param lexer : this lexer_IO gives tokenStream to parser to be parsed.
     */
    public Parser_IO(Lexer_IO lexer) {
        coolParser = new Cool_compilerParser(lexer.getTokensStream());

        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParsingErrorListener.parsingErrorListenerObject);
    }

    /**
     * get Concrete Syntax Tree for our program
     *
     * @return CST tree as string to be written in output file
     */
    public String getCST() {
        Cool_compilerParser.ProgramContext programContext = coolParser.program();
        String tree = programContext.toStringTree(coolParser);
        return tree;
    }

    /**
     * this function used to write CST tree string in the output file
     *
     * @param fileName this output file where The CST tree will be written
     */
    public void writeCST(String fileName){
        String tree = getCST();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(tree);
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
