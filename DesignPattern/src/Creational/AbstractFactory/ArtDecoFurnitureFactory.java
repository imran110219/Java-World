package Creational.AbstractFactory;

import Creational.Factory.*;

/**
 * Created by Imran on 2/22/2020.
 */
public class ArtDecoFurnitureFactory {
    public static Furniture buildFurniture(FurnitureType model)
    {
        Furniture furniture = null;
        switch (model)
        {
            case CHAIR:
                furniture = new Chair(Style.ARTDECO);
                break;

            case SOFA:
                furniture = new Sofa(Style.ARTDECO);
                break;

            case COFFEETABLE:
                furniture = new CoffeeTable(Style.ARTDECO);
                break;

            default:
                //throw some exception
                break;
        }
        return furniture;
    }
}
