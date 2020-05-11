package Creational.AbstractFactory;

public class Chair extends Furniture {
    public Chair() {
        super(FurnitureType.CHAIR);
        construct();
    }

    public Chair(Style style) {
        super(FurnitureType.CHAIR, style);
        construct(style);
    }

    @Override
    protected void construct() {
        System.out.println("Building Chair");
    }

    @Override
    protected void construct(Style style) {
        System.out.println("Building " + style + " Chair");
        // add accessories
    }
}
