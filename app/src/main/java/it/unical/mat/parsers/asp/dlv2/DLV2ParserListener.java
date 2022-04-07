// Generated from /home/francesco/Scrivania/embasp/EmbASP-antlr-grammars/dlv2/DLV2Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DLV2Parser}.
 */
public interface DLV2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DLV2Parser#answer_set}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_set(DLV2Parser.Answer_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLV2Parser#answer_set}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_set(DLV2Parser.Answer_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DLV2Parser#cost}.
	 * @param ctx the parse tree
	 */
	void enterCost(DLV2Parser.CostContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLV2Parser#cost}.
	 * @param ctx the parse tree
	 */
	void exitCost(DLV2Parser.CostContext ctx);
	/**
	 * Enter a parse tree produced by {@link DLV2Parser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(DLV2Parser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLV2Parser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(DLV2Parser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DLV2Parser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(DLV2Parser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLV2Parser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(DLV2Parser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DLV2Parser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(DLV2Parser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLV2Parser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(DLV2Parser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DLV2Parser#predicate_atom}.
	 * @param ctx the parse tree
	 */
	void enterPredicate_atom(DLV2Parser.Predicate_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLV2Parser#predicate_atom}.
	 * @param ctx the parse tree
	 */
	void exitPredicate_atom(DLV2Parser.Predicate_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DLV2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DLV2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLV2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DLV2Parser.TermContext ctx);
}