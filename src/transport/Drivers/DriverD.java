package transport.Drivers;

import transport.Bus;

import transport.category.CategoryD;

public class DriverD extends Driver<Bus> {

    public DriverD(String name, boolean hasDriverLicense, int experience, CategoryD category) {
        this.name = name;
        this.hasDriverLicense= hasDriverLicense;
        this.Experience = experience;
        this.category = category;
    }

    @Override
    public String getName() {
        return name;
    }
}
