package transport;

public class Truck extends Transport implements Competing{

    double engineVolume;

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model);
        setEngineVolume(engineVolume);
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume ==0.0? 1.5:engineVolume;
    }
    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                '}';
    }
    public void refill(){
        System.out.println("можно заправлять бензином или дизелем на заправке");
    }
    public void startMoving(){
        System.out.println("начало движения");
    }
    public void finishMoving(){
        System.out.println("конец движения");
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп - 10 сек");
    }

    @Override
    public void bestLapTime() {
        System.out.println("лучшее время круга - 1,5 часа");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость - 200 км/ч");
    }
}
