package transport.Drivers;

import transport.Categories;
import transport.Truck;
import transport.category.CategoryC;


public class DriverC extends Driver<Truck> {


    public DriverC(String name, boolean hasDriverLicense, int experience, CategoryC category) {
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
