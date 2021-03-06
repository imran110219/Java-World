package Creational.Factory;

import Creational.AbstractFactory.Style;

/**
 * Created by Imran on 2/22/2020.
 */
public abstract class Car {

    public Car(CarType model) {

    }

    public Car(CarType luxury, Style style) {
    }

    private void arrangeParts() {
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    private CarType model = null;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
