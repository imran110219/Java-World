package Creational.AbstractFactory;

public class CoffeeTable extends Furniture {
    public CoffeeTable() {
        super(FurnitureType.CHAIR);
        construct();
    }

    public CoffeeTable(Style style) {
        super(FurnitureType.CHAIR, style);
        construct(style);
    }

    @Override
    protected void construct() {
        System.out.println("Building Coffee Table");
    }

    @Override
    protected void construct(Style style) {
        System.out.println("Building " + style + " Coffee Table");
    }
}
