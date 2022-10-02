package transport;

public class Bus extends Transport{


    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color) {
        super(brand, model, productionYear, productionCountry, color);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maximumMovementSpeed=" + maximumMovementSpeed +
                '}';
    }
    public void refill(){
        System.out.println("можно заправлять бензином или дизелем на заправке");
    }
}

