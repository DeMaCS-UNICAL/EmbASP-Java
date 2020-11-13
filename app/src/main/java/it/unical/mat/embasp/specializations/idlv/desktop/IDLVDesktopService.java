package it.unical.mat.embasp.specializations.idlv.desktop;

import it.unical.mat.embasp.base.Callback;
import it.unical.mat.embasp.base.InputProgram;
import it.unical.mat.embasp.base.OptionDescriptor;
import it.unical.mat.embasp.base.Output;
import it.unical.mat.embasp.platforms.desktop.DesktopService;
import it.unical.mat.embasp.specializations.idlv.IDLVMinimalModels;

import java.util.ArrayList;
import java.util.List;

public class IDLVDesktopService extends DesktopService {

    public IDLVDesktopService(final String exe_path) {
        super(exe_path);
        load_from_STDIN_option = "--stdin";
    }

    @Override
    protected Output getOutput(final String output, final String error) {
        return new IDLVMinimalModels(output, error);
    }

    @Override
    public void startAsync(final Callback callback, final List<InputProgram> programs, final List<OptionDescriptor> options) {
        super.startAsync(callback, programs, options);
    }

    @Override
    public Output startSync(final List<InputProgram> programs, List<OptionDescriptor> options) {
        ArrayList<OptionDescriptor> newOptions = new ArrayList<>(options);
        newOptions.add(new OptionDescriptor("--t"));
        return super.startSync(programs, newOptions);
    }
}


