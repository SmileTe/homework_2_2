package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car {
    public Car.Insurance insurance;
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

    public static class Insurance{
        private int duration;
        private int cost;
        private String number;

        public int getDuration() {
            return duration;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void setDuration(int duration) {
            this.duration = duration<0? 0:duration;
        }

        public void setCost(int cost) {
            this.cost = cost<0? 0:cost;
        }

        public void setNumber(String number) {

            if(number==null||number.isEmpty()||number.isBlank()){
                this.number ="default";
            }
            else if(number.length()!=9){
                System.out.println("Номер страховки некорректный!");
                this.number ="default";
            }
            else {
                this.number = number;
            }
        }

        public Insurance(int duration, int cost, String number) {
            setNumber(number);
            setCost(cost);
            setDuration(duration);
        }

        @Override
        public String toString() {
            return "insurance{" +
                    "duration=" + duration +
                    ", cost=" + cost +
                    ", number=" + number +
                    '}';
        }

        public static boolean DurationIsOverdue(int duration) {
            if (duration < LocalDate.now().getYear()) {
                return true;
            }
            return false;
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



