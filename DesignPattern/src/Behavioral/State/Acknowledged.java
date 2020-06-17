package Behavioral.State;

/**
 * Created by Imran on 3/5/2020.
 */
public class Acknowledged implements State
{
    //Singleton
    private static Acknowledged instance = new Acknowledged();

    private Acknowledged() {}

    public static Acknowledged instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is acknowledged !!");
        ctx.setCurrentState(Shipped.instance());
    }
}