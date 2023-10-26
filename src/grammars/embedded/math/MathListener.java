// Generated from Math.g4 by ANTLR 4.4

	package grammars.embedded.math;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathParser}.
 */
public interface MathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(@NotNull MathParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(@NotNull MathParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(@NotNull MathParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(@NotNull MathParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(@NotNull MathParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(@NotNull MathParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MathParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MathParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(@NotNull MathParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(@NotNull MathParser.WsContext ctx);
}