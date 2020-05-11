package Creational.AbstractFactory;

public class Sofa extends Furniture {
    public Sofa() {
        super(FurnitureType.CHAIR);
        construct();
    }

    public Sofa(Style style) {
        super(FurnitureType.CHAIR, style);
        construct(style);
    }

    @Override
    protected void construct() {
        System.out.println("Building Sofa");
    }

    @Override
    protected void construct(Style style) {
        System.out.println("Building "+ style +" Sofa");
    }
}
