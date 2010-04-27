/*
 */
package pl.project13.tsalgorithms.api;

import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import prefuse.action.Action;

/**
 *
 * @author ktoso
 */
abstract public class SolverAction extends Action {

    private InputOutput io = getIO();

    protected void log(String line) {
        io.getOut().print(line + "\n");
    }

    protected void err(String line) {
        getIO().getErr().append(line + "\n");
    }

    private InputOutput getIO() {
        if (io == null) {
            io = IOProvider.getDefault().getIO("Algorithm log", false);
        }
        return io;
    }
}