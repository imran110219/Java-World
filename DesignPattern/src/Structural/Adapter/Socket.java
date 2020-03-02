package Structural.Adapter;

/**
 * Created by Sadman on 3/2/2020.
 */
public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
