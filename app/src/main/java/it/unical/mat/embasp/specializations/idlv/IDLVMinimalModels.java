package it.unical.mat.embasp.specializations.idlv;

import it.unical.mat.embasp.languages.datalog.MinimalModels;
import it.unical.mat.parsers.datalog.DatalogSolversParser;

public class IDLVMinimalModels extends MinimalModels {

    public IDLVMinimalModels(String out) {
        super(out);
    }

    public IDLVMinimalModels(String out, String err) {
        super(out, err);
    }

    protected void parse() {
        DatalogSolversParser.parseIDLV(this, output, true);
    }

}

