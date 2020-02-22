package Creational.AbstractFactory;

import Creational.Factory.Car;
import Creational.Factory.CarType;

/**
 * Created by Imran on 2/22/2020.
 */
public class CarFactory {
    private CarFactory() {
        //Prevent instantiation
    }

    public static Car buildCar(CarType type)
    {
        Car car = null;
        Location location = Location.ASIA; //Read location property somewhere from configuration
        //Use location specific car factory
        switch(location)
        {
            case USA:
                car = USACarFactory.buildCar(type);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }
        return car;
    }
}
