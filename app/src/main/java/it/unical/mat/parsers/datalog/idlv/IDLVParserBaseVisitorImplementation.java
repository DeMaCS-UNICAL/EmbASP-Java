package it.unical.mat.parsers.datalog.idlv;


import it.unical.mat.embasp.languages.datalog.MinimalModel;
import it.unical.mat.parsers.datalog.DatalogDataCollection;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.util.HashSet;

public class IDLVParserBaseVisitorImplementation extends IDLVParserBaseVisitor<Void> {

    private final DatalogDataCollection models;
    private MinimalModel modelCurrentlyBeingVisited;

    public IDLVParserBaseVisitorImplementation(final DatalogDataCollection models) {
        this.models = models;
        this.modelCurrentlyBeingVisited = null;
    }

    public static void parse(DatalogDataCollection models, String atomsList, boolean two_stageParsing) {

        final CommonTokenStream tokens = new CommonTokenStream(new IDLVLexer(CharStreams.fromString(atomsList)));
        final IDLVParser parser = new IDLVParser(tokens);
        final IDLVParserBaseVisitorImplementation visitor = new IDLVParserBaseVisitorImplementation(models);

        if (!two_stageParsing) {
            visitor.visit(parser.output());
            return;
        }

        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());

        try {
            visitor.visit(parser.output());
        } catch (final RuntimeException exception) {
            if (exception.getClass() == RuntimeException.class && exception.getCause() instanceof RecognitionException) {
                tokens.seek(0);
                parser.addErrorListener(ConsoleErrorListener.INSTANCE);
                parser.setErrorHandler(new DefaultErrorStrategy());
                parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                visitor.visit(parser.output());
            }
        }
    }

    @Override
    public Void visitPredicate_atom(IDLVParser.Predicate_atomContext ctx) {
        System.out.println("aggiungo " + ctx.getText());
        modelCurrentlyBeingVisited.getAtomsAsStringList().add(ctx.getText());
        return null;
    }

    @Override
    public Void visitMinimal_model(IDLVParser.Minimal_modelContext ctx) {
        System.out.println("Creo modello");
        modelCurrentlyBeingVisited = new MinimalModel(new HashSet<String>());
        models.addMinimalModel(modelCurrentlyBeingVisited);
        return visitChildren(ctx);
    }
}
