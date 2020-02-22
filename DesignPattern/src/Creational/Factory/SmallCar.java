package Creational.Factory;

import Creational.AbstractFactory.Location;

/**
 * Created by Imran on 2/22/2020.
 */
public class SmallCar extends Car {

    public SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    public SmallCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}
