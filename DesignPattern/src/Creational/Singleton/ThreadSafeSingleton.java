package Creational.Singleton;

/**
 * Created by Imran on 2/22/2020.
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance = null;

    // private constructor
    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
