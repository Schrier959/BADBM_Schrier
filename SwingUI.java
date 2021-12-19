package edu.touro.mco152.bm;
import javax.swing.*;
import java.beans.PropertyChangeListener;

public class SwingUI  extends SwingWorker<Boolean, DiskMark> implements CustomUserInterface{

    @Override
    protected Boolean doInBackground() throws Exception {
        return false;
    }

    @Override
    public boolean CustIsCanceled() {
        return isCancelled();
    }


    @Override
    public void CustSetProgress(int x) {
        setProgress(x);
    }

    @Override
    public void CustPublish(DiskMark wMark) {
        publish(wMark);
    }

    @Override
    public Boolean CustCancel(boolean mayInterruptIfRunning) {
        return cancel(mayInterruptIfRunning);
    }

    @Override
    public void CustAddPropertyChangeListener(PropertyChangeListener listener) {
        addPropertyChangeListener(listener);
    }

    @Override
    public void CustExecute() {
        execute();
    }
}
