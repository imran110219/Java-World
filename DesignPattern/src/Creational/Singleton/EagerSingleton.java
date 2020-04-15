package Creational.Singleton;

/**
 * Created by Imran on 2/22/2020.
 */
public class EagerSingleton {

    private static volatile EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
