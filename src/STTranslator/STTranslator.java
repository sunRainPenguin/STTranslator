package STTranslator;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import grammar.*;
import grammar.STParser.IF_StmtContext;
import grammar.STParser.Prog_DeclContext;

public class STTranslator {
	public static void main(String args[]) {
		File f = new File("inputST/TankControler.st");
		try {
			FileInputStream fs = new FileInputStream(f);
			ANTLRInputStream input = new ANTLRInputStream(fs);
			STLexer lexer = new STLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			STParser parser = new STParser(tokens);
			
			STParser.Prog_DeclContext context = parser.prog_Decl();
			STICILVisitor visitor = new STICILVisitor();
			visitor.visit(context);
//			ParseTree tree = parser.sT_LT_prog();
//			ParseTreeWalker walker = new ParseTreeWalker();
//			walker.walk(new STBaseListener(), tree);
//			System.out.println(); // print a \n after translation		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//STParser stParser = new STParser(input);
	}
}
