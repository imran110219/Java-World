package Behavioral.State;

/**
 * Created by Imran on 3/5/2020.
 */
public class InTransition implements State
{
    //Singleton
    private static InTransition instance = new InTransition();

    private InTransition() {}

    public static InTransition instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(Context ctx)
    {
        System.out.println("Package is in transition !!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}