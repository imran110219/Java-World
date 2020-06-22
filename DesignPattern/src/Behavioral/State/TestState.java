package Behavioral.State;

/**
 * Created by Imran on 3/5/2020.
 */
public class TestState {
    public static void main(String[] args)
    {
        Context ctx = new Context(null, "Test123");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
