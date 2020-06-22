package Behavioral.State;

/**
 * Created by Imran on 3/5/2020.
 */
public class Shipped implements State
{
    //Singleton
    private static Shipped instance = new Shipped();

    private Shipped() {}

    public static Shipped instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(Context ctx)
    {
        System.out.println("Package is shipped !!");
        ctx.setCurrentState(InTransition.instance());
    }
}