package Behavioral.State;

/**
 * Created by Imran on 3/5/2020.
 */
public class Delivered implements PackageState
{
    //Singleton
    private static Delivered instance = new Delivered();

    private Delivered() {}

    public static Delivered instance() {
        return instance;
    }

    //Business logic
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is delivered!!");
    }
}
