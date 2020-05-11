package Creational.Factory;

import Creational.AbstractFactory.Style;

/**
 * Created by Imran on 2/22/2020.
 */
public class LuxuryCar extends Car {

    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    public LuxuryCar(Style style) {
        super(CarType.LUXURY, style);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}
