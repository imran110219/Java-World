package java8.lambdaexpression;

/**
 * @author Sadman
 */
@FunctionalInterface  //It is optional
interface Drawable1{
    public void draw();
}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable1 d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }
}