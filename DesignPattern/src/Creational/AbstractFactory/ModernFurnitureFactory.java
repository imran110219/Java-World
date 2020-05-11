package Creational.AbstractFactory;

import Creational.Factory.*;

/**
 * Created by Imran on 2/22/2020.
 */
public class ModernFurnitureFactory {
    public static Furniture buildFurniture(FurnitureType model)
    {
        Furniture furniture = null;
        switch (model)
        {
            case CHAIR:
                furniture = new Chair(Style.MODERN);
                break;

            case SOFA:
                furniture = new Sofa(Style.MODERN);
                break;

            case COFFEETABLE:
                furniture = new CoffeeTable(Style.MODERN);
                break;

            default:
                //throw some exception
                break;
        }
        return furniture;
    }
}
