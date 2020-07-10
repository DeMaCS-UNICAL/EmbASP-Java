package it.unical.mat.parsers.datalog;

import it.unical.mat.embasp.languages.datalog.MinimalModel;
import it.unical.mat.embasp.languages.datalog.MinimalModels;

/**
 * The interface to be implemented by all classes (such as {@link MinimalModels}) that store Datalog models.
 */

public interface DatalogDataCollection {

    void addMinimalModel(MinimalModel minimalModel);

}
