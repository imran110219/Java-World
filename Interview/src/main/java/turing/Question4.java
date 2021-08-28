package turing;

/**
 * @author Sadman
 */
public class Question4 {
    public static void main(String[] args) {
        Super s = new Subclass();
        s.foo();
    }
}

class Super {

    public void foo() {
        System.out.println("Super");
    }
}

class Subclass extends Super {
    static void foo() {
        System.out.println("Subclass");
    }
}
