package transport;

public abstract class Transport {
    /*
    Марка
Модель
Год выпуска
Страна производства
Цвет кузова
Максимальная скорость передвижения
     */

     String brand;
     String model;
    private Integer productionYear;
    private String productionCountry;
     String color;
     int maximumMovementSpeed;

    public abstract void refill();

    public Transport(String brand, String model, Integer productionYear, String productionCountry, String color, int maximumMovementSpeed) {
        setBrand(brand);
        setModel(model);
        setProductionYear(productionYear);
        setProductionCountry(productionCountry);
        this.color = color;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }
    public Transport(String brand, String model, Integer productionYear, String productionCountry, String color) {
        setBrand(brand);
        setModel(model);
        setProductionYear(productionYear);
        setProductionCountry(productionCountry);
        this.color = color;
        //this.maximumMovementSpeed = 0;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear ==0? 2000:productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry ==null? "default":productionCountry;
    }

    public void setBrand(String brand) {
        this.brand = brand ==null? "default":brand;
    }

    public void setModel(String model) {
        this.model = model ==null? "default":model;
    }

    public void setColor(String color) {
        this.color = color ==null? "белый":color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }



}
