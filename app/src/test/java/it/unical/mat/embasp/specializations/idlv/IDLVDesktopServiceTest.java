package it.unical.mat.embasp.specializations.idlv;

import it.unical.mat.embasp.base.Handler;
import it.unical.mat.embasp.base.InputProgram;
import it.unical.mat.embasp.base.OptionDescriptor;
import it.unical.mat.embasp.languages.asp.SymbolicConstant;
import it.unical.mat.embasp.languages.datalog.DatalogInputProgram;
import it.unical.mat.embasp.languages.datalog.DatalogMapper;
import it.unical.mat.embasp.languages.datalog.MinimalModel;
import it.unical.mat.embasp.languages.datalog.MinimalModels;
import it.unical.mat.embasp.platforms.desktop.DesktopHandler;
import it.unical.mat.embasp.specializations.idlv.desktop.IDLVDesktopService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;

/*
* Simple test class calculating the transitive closure of a graph.
* */

public class IDLVDesktopServiceTest {

    @Test
    public void mainTest() {

        try {
            Edge o1 = new Edge(1, 2);
            Edge o2 = new Edge(2, 3);
            Edge o3 = new Edge(2, 4);
            Edge o4 = new Edge(3, 5);
            Edge o5 = new Edge(5, 6);

            Handler testHandler = new DesktopHandler(new IDLVDesktopService(getPath()));
            InputProgram testInputProgram = new DatalogInputProgram();
            testInputProgram.addProgram("path(X,Y) :- edge(X,Y).");
            testInputProgram.addProgram("path(X,Y) :- path(X,Z), path(Z,Y). ");
            testInputProgram.addObjectInput(o1);
            testInputProgram.addObjectInput(o2);
            testInputProgram.addObjectInput(o3);
            testInputProgram.addObjectInput(o4);
            testInputProgram.addObjectInput(o5);

            testHandler.addProgram(testInputProgram);
            DatalogMapper.getInstance().registerClass(Path.class);

            MinimalModels minimalModels = (MinimalModels) testHandler.startSync();
            Assert.assertTrue(minimalModels.getMinimalModels().size() == 1);
            Assert.assertNotNull(minimalModels);
            Assert.assertTrue("Found error:\n" + minimalModels.getErrors(),  minimalModels.getErrors().isEmpty());

            for (MinimalModel m : minimalModels.getMinimalModels()) {
                for (Object a : m.getAtomsAsObjectSet()) {
                    if (a instanceof Path) {
                        System.out.println(a);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getPath() {

        final String os = System.getProperty("os.name").toLowerCase();
        final String arch = System.getProperty("os.arch");

        String path = ".." + File.separator + ".." + File.separator + "test-resources" + File.separator
                + "datalog" + File.separator + "executables" + File.separator + "idlv" + File.separator;

        if (os.contains("win"))
            if (arch.contains("64"))
                path += "idlv.win.64";
            else
                path += "idlv.win.32";
        else if (os.contains("nux"))
            if (arch.contains("64"))
                path += "idlv.linux.64";
            else
                path += "idlv.linux.32";
        else if (os.contains("mac"))
            path += "idlv.mac";

        return path;
    }

}
