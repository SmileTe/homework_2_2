package transport.Drivers;


import transport.Transport;
import transport.category.Category;
import transport.category.CategoryA;

import java.util.Locale;


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
}


