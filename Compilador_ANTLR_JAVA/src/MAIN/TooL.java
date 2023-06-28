package MAIN;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR.ParserTLexer;
import ANTLR.ParserTParser;


@SuppressWarnings("deprecation")
public class TooL {
	
	public static void main(String[] args)throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("example/ejemplo0.txt"));
		ParserTLexer lexer = new ParserTLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParserTParser parser = new ParserTParser(tokens);  
        ParseTree tree = parser.program();
        MyVisitor eval = new MyVisitor(); 
        eval.visit(tree);
        
	}

}
