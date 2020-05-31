package translation;

import org.antlr.v4.runtime.tree.ParseTree;
import translation.translators.ClassDefinitionTranslator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TranslatorHandler
{
    private static BufferedWriter output_stream = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int label_ind = -1;

    public static void translate(ParseTree parseTree) {
        System.out.println("");
        // TODO: call Start RUlE Here
        //new ClassBodyTranslator(parseTree).gen();
        //new ExprTranslator(parseTree).gen();
        new ClassDefinitionTranslator(parseTree).gen();
        try {
            output_stream.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void write(String text) {
        try {
            output_stream.write(String.format("%s\n", text));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setStream(OutputStream os) {
        output_stream = new BufferedWriter(new OutputStreamWriter(os));
    }

    public static String getNewLabel() {
        ++label_ind;
        return String.format("L%d", label_ind);
    }
}
