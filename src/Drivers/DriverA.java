package Drivers;

import Drivers.Driver;
import transport.Car;


public class DriverA extends Driver<Car> {

    public DriverA(String name, String typeDriverLicense, int experience, Car car) {
        this.name = name;
        this.typeDriverLicense = typeDriverLicense;
        this.Experience = experience;
        this.transport = car;
    }

    @Override
    public String getName() {
        return name;
    }

}
