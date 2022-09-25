public class Car {
   private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, Integer productionYear, String productionCountry) {
        this.brand = brand ==null? "default":brand;
        this.model =model ==null? "default":model;
        this.engineVolume = engineVolume ==0.0? 1.5:engineVolume;
        this.color = color ==null? "белый":color;
        this.productionYear =  productionYear ==0? 2000:productionYear;
        this.productionCountry = productionCountry ==null? "default":productionCountry;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }
}



