package transport;

public class Truck extends Transport implements Competing{

    private LoadType loadType;

    public enum LoadType {

        N1("N1  (с полной массой до 3,5 тонн) "),
        N2("N2  (с полной массой свыше 3,5 до 12 тонн)"),
        N3("N3  (с полной массой свыше 12 тонн)");

        private String title;

        LoadType(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;

        }
    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        setEngineVolume(engineVolume);
    }
    public Truck(String brand, String model, double engineVolume, LoadType loadType) {
        super(brand, model, engineVolume);
          this.loadType = loadType;
    }

    public LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(LoadType loadType) {
        this.loadType = loadType;
    }

    //public void setEngineVolume(double engineVolume) {
//        this.engineVolume = engineVolume ==0.0? 1.5:engineVolume;
//    }
    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume='" + getEngineVolume() + '\'' +
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

    @Override
    public void printType() {
        if(loadType ==null){
            System.out.println("Данных недостаточно");
        }
        else {
            System.out.println(getLoadType());
        }
    }

    @Override
    public boolean undergoDiagnostics() {
        return true;
    }

    @Override
    public void fixAuto() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен") ;
    }
}
