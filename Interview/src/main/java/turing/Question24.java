package turing;

/**
 * @author Sadman
 */
class Parent {
    {
        System.out.print("A ");
    }
    static {
        System.out.print("B ");
    }
}

class Child extends Parent {
    {
        System.out.print("C ");
    }
    static {
        System.out.print("D ");
    }
}

public class Question24 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
