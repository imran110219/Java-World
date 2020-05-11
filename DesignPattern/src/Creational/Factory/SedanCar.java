package Creational.Factory;

import Creational.AbstractFactory.Style;

/**
 * Created by Imran on 2/22/2020.
 */
public class SedanCar extends Car {

    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    public SedanCar(Style style) {
        super(CarType.SEDAN, style);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }
}
