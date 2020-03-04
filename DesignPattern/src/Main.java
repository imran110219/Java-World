import Behavioral.State.TestState;
import Creational.Builder.TestBuilder;
import Creational.Factory.TestFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        switch(name){
            //Case statements
            case "Singleton": System.out.println("Singleton");
                break;
            case "Builder": TestBuilder.main(args);
                break;
            case "Factory": TestFactory.main(args);
                break;
            //Default case statement
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
}
