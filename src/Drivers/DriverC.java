package Drivers;

import Drivers.Driver;
import transport.Truck;


public class DriverC extends Driver<Truck> {


    public DriverC(String name, String typeDriverLicense, int experience, Truck truck) {
        this.name = name;
        this.typeDriverLicense = typeDriverLicense;
        this.Experience = experience;
        this.transport = truck;
    }

    @Override
    public String getName() {
        return name;
    }
}
