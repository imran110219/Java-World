package Creational.AbstractFactory;

import Creational.Factory.*;

/**
 * Created by Imran on 2/22/2020.
 */
public class VictorianFurnitureFactory {
    public static Furniture buildFurniture(FurnitureType model)
    {
        Furniture furniture = null;
        switch (model)
        {
            case CHAIR:
                furniture = new Chair(Style.VICTORIAN);
                break;

            case SOFA:
                furniture = new Sofa(Style.VICTORIAN);
                break;

            case COFFEETABLE:
                furniture = new CoffeeTable(Style.VICTORIAN);
                break;

            default:
                //throw some exception
                break;
        }
        return furniture;
    }
}
