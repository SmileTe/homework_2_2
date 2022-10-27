package transport.Drivers;


import transport.Transport;
import transport.category.Category;
import transport.category.CategoryA;

import java.util.Locale;
import java.util.Objects;


public abstract class Driver <T extends Transport>{

    String name;
    boolean hasDriverLicense;
    int Experience;
    Category category;
    T transport;

    public String getName() {
        return name;
    }

    public T getTransport() {
        return transport;
    }

//    public String getTypeDriverLicense() {
//        return typeDriverLicense;
//    }


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return Objects.equals(name, driver.name) && Objects.equals(transport, driver.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transport);
    }
}


