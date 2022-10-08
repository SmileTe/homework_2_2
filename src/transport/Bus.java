package transport;

public class Bus extends Transport implements Competing{

    double engineVolume;
    private TypeCapacity typeCapacity;


    public enum TypeCapacity {

        ExtraSmall("особо малая (до 10 мест)"),
        Small("малая (до 25)"),
        Medium("средняя (40-50)"),
        Large("большая (60-80)"),
        EspeciallyLarge("особо большая (100-120 мест)");

        private String title;

        TypeCapacity(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;

        }
    }

    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color) {
        super(brand, model, productionYear, productionCountry, color);
    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model);
        setEngineVolume(engineVolume);
    }

    public Bus(String brand, String model, double engineVolume, TypeCapacity typeCapacity) {
        super(brand, model);
        setEngineVolume(engineVolume);
        this.typeCapacity = typeCapacity;
    }

    public TypeCapacity getTypeCapacity() {
        return typeCapacity;
    }

    public void setTypeCapacity(TypeCapacity typeCapacity) {
        this.typeCapacity = typeCapacity;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume ==0.0? 1.5:engineVolume;
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
        System.out.println("лучшее время круга - 2 часа");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость - 250 км/ч");
    }

    @Override
    public void printType() {
        if(typeCapacity ==null){
            System.out.println("Данных недостаточно");
        }
        else { System.out.println(getTypeCapacity());}
    }
}

