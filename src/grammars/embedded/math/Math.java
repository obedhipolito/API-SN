package grammars.embedded.math;

/**
@author Oscar Pulido Prieto.
*/

import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import grammars.embedded.math.MathLexer;
import grammars.embedded.math.MathParser;

public class Math extends grammars.EmbeddedGrammar {
	
	protected ArrayList<String> vars = new ArrayList<String>();
	
	@Override
	public String analyzeCode(String code) {
		String var = "";
		
		CharStream input = new ANTLRInputStream(code);
		
		MathLexer lexer = new MathLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MathParser parser = new MathParser(tokens);
		
		parser.entry();
		var = parser.getCode();
		
		var = var.replace("[plus]", "$plus");
		var = var.replace("[minus]", "$minus");
		var = var.replace("[times]", "$times");
		var = var.replace("[div]", "$div");
		var = var.replace("[percent]", "$percent");
		
		
		return var;
	}
	
	/*public static void main(String[] arg) {
		
		//String code = "a = 5\nb = (5   +7-3)\nc = -5\nd =    5.4+2.5\nX = 5+1\n           a = b*c - (X/a)\n";
		String code = "		res = e + d - c * b / a\n";
		
		Math m = new Math();
		
		String mm = m.analyzeCode(code);
		
		System.out.println(mm);
	}*/
}
