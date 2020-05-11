package Creational.AbstractFactory;

import Creational.Factory.CarType;

public abstract class Furniture {
    public Furniture(FurnitureType model) {

    }

    public Furniture(FurnitureType chair, Style style) {
    }

    private void arrangeParts() {
        // Do one time processing here
    }

    protected abstract void construct();

    protected abstract void construct(Style style);

    private FurnitureType model = null;

    public FurnitureType getModel() {
        return model;
    }

    public void setModel(FurnitureType model) {
        this.model = model;
    }
}
