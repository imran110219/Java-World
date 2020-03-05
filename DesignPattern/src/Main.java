import Behavioral.State.TestState;
import Creational.AbstractFactory.TestAbstractFactory;
import Creational.Builder.TestBuilder;
import Creational.Factory.TestFactory;
import Creational.Prototype.TestPrototype;
import Structural.Adapter.TestAdapter;
import Structural.Decorator.TestDecorator;

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
            case "AbstractFactory": TestAbstractFactory.main(args);
                break;
            case "Prototype": TestPrototype.main(args);
                break;
            case "Adapter": TestAdapter.main(args);
                break;
            case "Decorator": TestDecorator.main(args);
                break;
            //Default case statement
            default:System.out.println("Not available");
        }
    }
}
