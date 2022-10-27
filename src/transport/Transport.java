package transport;

import transport.Drivers.Driver;

import java.util.*;


public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public abstract void refill();
    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract void printType();
    public abstract boolean undergoDiagnostics();
    public abstract void fixAuto();


    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);

    }
    public Transport(String brand, String model, double engineVolume, List<Driver<?>> drivers) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public void setBrand(String brand) {
        this.brand = brand ==null? "default":brand;
    }

    public void setModel(String model) {
        this.model = model ==null? "default":model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        engineVolume = engineVolume ==0.0? 1.5:engineVolume;
    }

    public static void checkDriverLicense (String driverLicense) throws WrongDriverLicense {

        if (driverLicense == null || driverLicense.isBlank() || driverLicense.isEmpty()) {
            throw new WrongDriverLicense();
        }
    }

    public void addDriver(Driver<?> ...newDrivers){

        this.drivers.addAll(Arrays.asList(newDrivers));
    }
    public void addMechanic(Mechanic<?> ...newMechanics){

        this.mechanics.addAll(Arrays.asList(newMechanics));
    }
    public void addSponsor(Sponsor... newSponsors){
        this.sponsors.addAll(Arrays.asList(newSponsors));
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
