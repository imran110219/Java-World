package turing;

/**
 * @author Sadman
 */
class box {
    int width;
    int height;
    int length;
}

public class Question29 {
    public static void main(String[] args) {
        box obj1 = new box();
        box obj2 = new box();
        obj1.height = 1;
        obj1.length = 1;
        obj1.width = 1;
        obj2 = obj1;
        System.out.println(obj2.height);
    }
}
