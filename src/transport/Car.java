package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car extends Transport implements Competing{
    public Car.Insurance insurance;
    //private double engineVolume;
    private String bodyType;
    private  String registrationNumber;
    private int seatingCapacity;
    private String summerOrWinterRubber;

    private TypeBody typeBody;

    public enum TypeBody {

        SEDAN("Седан"),
        Hatchback("Хетчбек"),
        Coupe("Купе"),
        Universal("Универсал"),
        SUV("Внедорожник"),
        crossover("Кроссовер"),
        pickup("Пикап"),
        Van("Фургон"),
        Minivan("Минивэн");

        private String title;

        TypeBody(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;

        }
    }

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
        return super.getBrand();
    }

    public String getModel() {
        return super.getModel();
    }


    public String getBodyType() {
        return bodyType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
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


    public Car(String brand, String model, double engineVolume) {
        super(brand, model,engineVolume);
        setEngineVolume(engineVolume);
        }

    public Car(String brand, String model, double engineVolume, TypeBody typeBody) {
        super(brand, model,engineVolume);

        setSeatingCapacity(0);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public String toString() {
        return "transport.Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", bodyType='" + getBodyType() + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seatingCapacity='" + getSeatingCapacity() + '\'' +
                ", summerOrWinterRubber='" + summerOrWinterRubber + '\'' +
                '}';
    }

    public void refill(){
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электро-парковках, если это электрокар.");
    }
    public void startMoving(){
        System.out.println("начало движения");
    }
    public void finishMoving(){
        System.out.println("конец движения");
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп - 5 сек");
    }

    @Override
    public void bestLapTime() {
        System.out.println("лучшее время круга - 1 час");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость - 150 км/с");
    }

    @Override
    public void printType() {
        if(typeBody ==null){
            System.out.println("Данных недостаточно");
        }
        else {
            System.out.println(getTypeBody());
        }
    }

    @Override
    public boolean undergoDiagnostics() {
        return true;
    }

    @Override
    public void fixAuto() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена") ;
    }
}



