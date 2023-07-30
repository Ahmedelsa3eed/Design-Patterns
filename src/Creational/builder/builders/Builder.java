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
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}