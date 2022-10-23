package transport.Drivers;

import transport.Car;
import transport.category.CategoryA;


public class DriverA extends Driver<Car> {

    public DriverA(String name, boolean hasDriverLicense, int experience,  CategoryA category) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.Experience = experience;
        this.category = category;
    }

    @Override
    public String getName() {
        return name;
    }

}
