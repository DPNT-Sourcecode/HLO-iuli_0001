package tdl.record_upload;

public interface MonitoredBackgroundTask extends Stoppable, MonitoredSubject {

    void start();
}
