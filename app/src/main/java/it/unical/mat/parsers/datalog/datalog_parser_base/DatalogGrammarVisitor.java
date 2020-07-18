package it.unical.mat.parsers.datalog.datalog_parser_base;// Generated from .\DatalogGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DatalogGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DatalogGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DatalogGrammarParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(DatalogGrammarParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogGrammarParser#predicate_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate_atom(DatalogGrammarParser.Predicate_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(DatalogGrammarParser.TermContext ctx);
}