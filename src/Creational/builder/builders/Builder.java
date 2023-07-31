package Creational.builder.builders;

import Creational.builder.cars.CarType;
import Creational.builder.components.Engine;
import Creational.builder.components.GPSNavigator;
import Creational.builder.components.Transmission;
import Creational.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    Builder setCarType(CarType type);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}