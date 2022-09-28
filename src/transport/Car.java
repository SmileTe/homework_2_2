package transport;

import java.util.regex.Pattern;

public class Car {
   private String brand;
   private String model;
    double engineVolume;
    String color;
    private Integer productionYear;
    private String productionCountry;
    private String bodyType;
    String registrationNumber;
    private int seatingCapacity;
    String summerOrWinterRubber;

    public static class Key{
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand ==null? "default":brand;
    }

    public void setModel(String model) {
        this.model = model ==null? "default":model;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear ==0? 2000:productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry ==null? "default":productionCountry;
    }

    public void setBodyType(String bodyType) {
        if(productionCountry==null||productionCountry.isBlank()||productionCountry.isEmpty())
        {  this.bodyType = "Информация не задана";}
        else {  this.bodyType = bodyType;}

    }

    public void setSeatingCapacity(int seatingCapacity) {
        if(seatingCapacity<=0) {this.seatingCapacity =2;}
        else { this.seatingCapacity = seatingCapacity;}

    }


    public void setRegistrationNumber(String registrationNumber) {
        String regex = "х+\\d\\d\\d+хх+\\d\\d\\d";
        boolean matches = Pattern.matches(regex, registrationNumber);
        if(matches) {
            this.registrationNumber = registrationNumber;
        }
        else {
        this.registrationNumber = "default";}
    }

    public void setSummerOrWinterRubber(String summerOrWinterRubber) {
        this.summerOrWinterRubber = summerOrWinterRubber;
    }

    public Car(String brand, String model, double engineVolume, String color, Integer productionYear,
               String productionCountry, String bodyType, int seatingCapacity) {
       setBrand(brand);
        setModel(model);
        this.engineVolume = engineVolume ==0.0? 1.5:engineVolume;
        this.color = color ==null? "белый":color;
       setProductionYear(productionYear);
       setProductionCountry(productionCountry);
       setBodyType(bodyType);
       setSeatingCapacity(seatingCapacity);


    }

    @Override
    public String toString() {
        return "transport.Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", bodyType='" + getBodyType() + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seatingCapacity='" + getSeatingCapacity() + '\'' +
                ", summerOrWinterRubber='" + summerOrWinterRubber + '\'' +


                '}';
    }


}



