package edu.touro.mco152.bm;

import java.beans.PropertyChangeListener;

public interface CustomUserInterface {
    public  boolean CustIsCanceled();
     void CustSetProgress(int x);
     void CustPublish(DiskMark wMark);
     Boolean CustCancel(boolean mayInterruptIfRunning);
     void CustAddPropertyChangeListener(PropertyChangeListener listener);
     void CustExecute();
}
