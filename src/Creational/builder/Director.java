package Creational.builder;

import Creational.builder.builders.Builder;
import Creational.builder.cars.CarType;
import Creational.builder.components.Engine;
import Creational.builder.components.GPSNavigator;
import Creational.builder.components.Transmission;
import Creational.builder.components.TripComputer;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR)
            .setSeats(2)
            .setEngine(new Engine(3.0, 0))
            .setTransmission(Transmission.SEMI_AUTOMATIC)
            .setTripComputer(new TripComputer())
            .setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR)
            .setSeats(2)
            .setEngine(new Engine(1.2, 0))
            .setTransmission(Transmission.AUTOMATIC)
            .setTripComputer(new TripComputer())
            .setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV)
            .setSeats(4)
            .setEngine(new Engine(2.5, 0))
            .setTransmission(Transmission.MANUAL)
            .setGPSNavigator(new GPSNavigator());
    }
}
