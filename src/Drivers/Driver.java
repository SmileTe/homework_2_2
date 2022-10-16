package Drivers;

import transport.Competing;
import transport.Transport;

public abstract class Driver <T extends Transport>{

    String name;
    String typeDriverLicense;
    int Experience;
    T transport;

    public String getName() {
        return name;
    }

    public T getTransport() {
        return transport;
    }

    public String getTypeDriverLicense() {
        return typeDriverLicense;
    }
}


