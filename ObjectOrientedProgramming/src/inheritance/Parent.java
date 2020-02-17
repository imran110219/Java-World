package inheritance;

/**
 * Created by Sadman on 2/17/2020.
 */
public class Parent {
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
