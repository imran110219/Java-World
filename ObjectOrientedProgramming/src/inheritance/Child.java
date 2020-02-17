package inheritance;

/**
 * Created by Sadman on 2/17/2020.
 */
public class Child extends Parent {

    private int height;

    // Child class must override parent constructor
    public Child(int age, int weight, int height) {
        super(age, weight); // super() is used for parent constructor
        this.height = height;
    }

    public void crying(){
        System.out.println("Child is crying.");
    }

    public String toString(){
        return super.toString() + " and height is " + height;
    }
}
