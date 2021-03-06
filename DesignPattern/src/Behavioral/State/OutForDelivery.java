package Behavioral.State;

/**
 * Created by Imran on 3/5/2020.
 */
public class OutForDelivery implements State
{
    //Singleton
    private static OutForDelivery instance = new OutForDelivery();

    private OutForDelivery() {}

    public static OutForDelivery instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(Context ctx)
    {
        System.out.println("Package is out of delivery !!");
        ctx.setCurrentState(Delivered.instance());
    }
}