package ANTLR;

import java.io.IOException;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#play}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlay(ParserTParser.PlayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#listen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 * @throws IOException
	 */
	T visitListen(ParserTParser.ListenContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by the {@code declarEnt}
	 * labeled alternative in {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarEnt(ParserTParser.DeclarEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarAco}
	 * labeled alternative in {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarAco(ParserTParser.DeclarAcoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarBol}
	 * labeled alternative in {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarBol(ParserTParser.DeclarBolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#son_dison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSon_dison(ParserTParser.Son_disonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOperY}
	 * labeled alternative in {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOperY(ParserTParser.CondOperYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarBolSiNo}
	 * labeled alternative in {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBolSiNo(ParserTParser.VarBolSiNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateSiNo}
	 * labeled alternative in {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateSiNo(ParserTParser.StateSiNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOperO}
	 * labeled alternative in {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOperO(ParserTParser.CondOperOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondCadSiNo}
	 * labeled alternative in {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondCadSiNo(ParserTParser.CondCadSiNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperAritSINO}
	 * labeled alternative in {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperAritSINO(ParserTParser.OperAritSINOContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(ParserTParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sum}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(ParserTParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ParserTParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ParserTParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ParserTParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ParserTParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Raiz}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiz(ParserTParser.RaizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(ParserTParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Elev}
	 * labeled alternative in {@link ParserTParser#oper_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElev(ParserTParser.ElevContext ctx);
}