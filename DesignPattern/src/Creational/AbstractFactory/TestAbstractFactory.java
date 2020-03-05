package Creational.AbstractFactory;

import Creational.Factory.CarType;

/**
 * Created by Imran on 2/22/2020.
 */
public class TestAbstractFactory {
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
