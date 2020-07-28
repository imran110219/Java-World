package inheritance;

/**
 * Created by Sadman on 2/17/2020.
 */
public class TestInheritance {
    public static void main(String[] args){
        Parent parent = new Parent(50, 80);
        Parent parent1 = new Parent();
        System.out.println(parent.toString());
        parent.eating();

        Child child = new Child(10,20,30);
        System.out.println(child.toString());
        child.eating();
    }
}
