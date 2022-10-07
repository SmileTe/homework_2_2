import transport.Competing;
import transport.Transport;

public class Driver <T extends Transport & Competing>{

    String name;
    String typeDriverLicense;
    int Experience;

    T transport;

    public Driver(String name, String typeDriverLicense, int experience, T transport) {
        this.name = name;
        this.typeDriverLicense = typeDriverLicense;
        this.Experience = experience;
        this.transport = transport;
    }

    public void printInformation( T transport ) {
        System.out.println("Водитель " + this.getName() +
                " управляет автомобилем " + transport.getBrand() +
                " и будет участвовать в заезде");
    }


    public void setName(String name) {
        this.name = name;
    }


    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public String getName() {
        return name;
    }


    public int getExperience() {
        return Experience;
    }

    public static void startMovement(){

    }
    public static void StopMovement(){

    }
    public static void refuelCar(){

    }



}
