package Behavioral.Observer;

/**
 * Created by Sadman on 3/2/2020.
 */
public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}
