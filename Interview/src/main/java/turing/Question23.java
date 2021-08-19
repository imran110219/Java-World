package turing;

/**
 * @author Sadman
 */
class newthread extends Thread {
    newthread(){
        super("My Thread");
        start();
    }
    public void run(){
        System.out.println(this);
    }
}

public class Question23 {
    public static void main(String[] args) {
        new newthread();
    }
}
