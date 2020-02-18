package polymorphism;

/**
 * Created by Sadman on 2/18/2020.
 */
class Parent {
    private int age;
    private int weight;

    public Parent(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void walking(){
        System.out.println("Parent is walking.");
    }

    public String toString(){
        return getClass().getSimpleName() + " age is " + age + " and weight is " + weight;
    }
}

class Child extends Parent {

    private int height;

    // Constructor Overriding
    public Child(int age, int weight, int height) {
        super(age, weight); // super() is used for parent constructor
        this.height = height;
    }

    // Method Overriding
    public void walking(){
        System.out.println("Child is walking.");
    }

    public void crying(){
        System.out.println("Child is crying.");
    }

    public String toString(){
        return super.toString() + " and height is " + height;
    }
}

public class Overriding {
    public static void main(String[] args){
        Parent parent = new Parent(50, 80);
        System.out.println(parent.toString());

        Child child = new Child(10,20,30);
        System.out.println(child.toString());
    }
}
