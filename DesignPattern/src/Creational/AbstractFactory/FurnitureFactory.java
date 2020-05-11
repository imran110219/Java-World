package Creational.AbstractFactory;

/**
 * Created by Imran on 2/22/2020.
 */
public class FurnitureFactory {
    private FurnitureFactory() {
        //Prevent instantiation
    }

    public static Furniture buildFurniture(FurnitureType type)
    {
        Style style = Style.MODERN;
        Furniture furniture = null;
        switch(style)
        {
            case MODERN:
                furniture = ModernFurnitureFactory.buildFurniture(type);
                break;
            case VICTORIAN:
                furniture = VictorianFurnitureFactory.buildFurniture(type);
                break;
            default:
                furniture = ArtDecoFurnitureFactory.buildFurniture(type);
        }
        return furniture;
    }

    public static Furniture buildFurniture(FurnitureType type, Style style)
    {
        Furniture furniture = null;
        switch(style)
        {
            case MODERN:
                furniture = ModernFurnitureFactory.buildFurniture(type);
                break;
            case VICTORIAN:
                furniture = VictorianFurnitureFactory.buildFurniture(type);
                break;
            default:
                furniture = ArtDecoFurnitureFactory.buildFurniture(type);
        }
        return furniture;
    }
}
