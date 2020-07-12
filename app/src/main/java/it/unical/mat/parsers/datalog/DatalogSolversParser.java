package it.unical.mat.parsers.datalog;

import it.unical.mat.parsers.datalog.idlv.IDLVParserBaseVisitorImplementation;

public class DatalogSolversParser {

    public static void parseIDLV(final DatalogDataCollection models, final String atomsList, final boolean two_stageParsing) {
        IDLVParserBaseVisitorImplementation.parse(models, atomsList, two_stageParsing);
    }
}
