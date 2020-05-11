package Creational.AbstractFactory;

/**
 * Created by Imran on 2/22/2020.
 */
public class TestAbstractFactory {
    public static void main(String[] args)
    {
        System.out.println(FurnitureFactory.buildFurniture(FurnitureType.CHAIR));
        System.out.println(FurnitureFactory.buildFurniture(FurnitureType.SOFA, Style.VICTORIAN));
        System.out.println(FurnitureFactory.buildFurniture(FurnitureType.COFFEETABLE, Style.ARTDECO));
    }
}
