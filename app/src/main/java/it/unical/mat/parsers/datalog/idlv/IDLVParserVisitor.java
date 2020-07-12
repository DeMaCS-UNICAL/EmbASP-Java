package it.unical.mat.parsers.datalog.idlv;// Generated from .\IDLVParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IDLVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IDLVParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link IDLVParser#output}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOutput(IDLVParser.OutputContext ctx);
    /**
     * Visit a parse tree produced by {@link IDLVParser#minimal_model}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinimal_model(IDLVParser.Minimal_modelContext ctx);
    /**
     * Visit a parse tree produced by {@link IDLVParser#predicate_atom}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPredicate_atom(IDLVParser.Predicate_atomContext ctx);
    /**
     * Visit a parse tree produced by {@link IDLVParser#term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTerm(IDLVParser.TermContext ctx);
}