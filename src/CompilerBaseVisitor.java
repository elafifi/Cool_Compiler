import gen.Cool_compilerBaseVisitor;
import gen.Cool_compilerParser;

public class CompilerBaseVisitor extends Cool_compilerBaseVisitor<Object> {
    @Override public Object visitProgram(Cool_compilerParser.ProgramContext ctx) {

        System.out.println(ctx.getText());

        return visitChildren(ctx);
    }



}
