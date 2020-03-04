package Behavioral.State;

/**
 * Created by Imran on 3/5/2020.
 */
public class TestState {
    public static void main(String[] args)
    {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
