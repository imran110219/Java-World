package java8.functionalinterface;

/**
 * @author Sadman
 */
public class Dog implements Animal {
    public void eat(String item) {
        System.out.println(item);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat("meat");
    }
}
