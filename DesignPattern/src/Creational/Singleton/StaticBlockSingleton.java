package Creational.Singleton;

/**
 * Created by Imran on 2/22/2020.
 */
public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred", e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
