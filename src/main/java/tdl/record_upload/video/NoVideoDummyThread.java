package tdl.record_upload.video;

import org.slf4j.Logger;
import tdl.record_upload.MonitoredBackgroundTask;
import tdl.record_upload.MonitoredSubject;
import tdl.record_upload.Stoppable;

public class NoVideoDummyThread implements MonitoredBackgroundTask {
    private boolean isRunning;
    private int tick;


    public NoVideoDummyThread() {
        isRunning = true;
        tick = 0;
    }

    @Override
    public void start() {
        // Do nothing
    }

    @Override
    public boolean isActive() {
        return isRunning;
    }

    @Override
    public void displayErrors(Logger log) {
        //No errors
    }

    @Override
    public void displayMetrics(StringBuilder displayBuffer) {
        tick += 1;
        displayBuffer.append(String.format("tick %3d, video recoding disabled", tick));
    }

    @Override
    public void join() {

        // Do nothing
    }

    @Override
    public void signalStop() {
        isRunning = false;
    }
}
