package Creational.Factory;

import Creational.AbstractFactory.Style;

/**
 * Created by Imran on 2/22/2020.
 */
public class SmallCar extends Car {

    public SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    public SmallCar(Style style) {
        super(CarType.SMALL, style);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}
