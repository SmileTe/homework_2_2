//package transport;
//
//public class Train extends Transport {
//
//    private int travelPrice;
//    private int travelTime;
//    private String departureStationName;
//    private String endStation;
//    private int numberOfCars;
//
//    public void refill(){
//        System.out.println("нужно заправлять дизелем");
//    }
//
//    @Override
//    public void printType() {
//
//    }
//
//    public Train(String brand, String model, Integer productionYear, String productionCountry, String color, int travelPrice, int travelTime, String departureStationName, String endStation, int numberOfCars, int maximumMovementSpeed) {
//        super(brand, model, productionYear, productionCountry, color,maximumMovementSpeed);
//        setTravelPrice(travelPrice);
//        setTravelTime(travelTime);
//        setDepartureStationName(departureStationName);
//        setEndStation(endStation);
//        setNumberOfCars(numberOfCars);
//
//    }
//
//    @Override
//    public String toString() {
//        return "Train{" +
//                "travelPrice=" + getTravelPrice() +
//                ", travelTime=" + getTravelTime() +
//                ", departureStationName='" + getDepartureStationName() + '\'' +
//                ", endStation='" + getEndStation() + '\'' +
//                ", numberOfCars=" + getNumberOfCars() +
//                ", brand='" + getBrand() + '\'' +
//                ", model='" + getModel() + '\'' +
//                ", color='" + getColor() + '\'' +
//                ", maximumMovementSpeed='" + getMaximumMovementSpeed() + '\'' +
//                '}';
//    }
//
//    public void setTravelPrice(int travelPrice) {
//        this.travelPrice = travelPrice;
//    }
//
//    public void setTravelTime(int travelTime) {
//        this.travelTime = travelTime;
//    }
//
//    public void setDepartureStationName(String departureStationName) {
//        this.departureStationName = departureStationName;
//    }
//
//    public void setEndStation(String endStation) {
//        this.endStation = endStation;
//    }
//
//    public void setNumberOfCars(int numberOfCars) {
//        this.numberOfCars = numberOfCars;
//    }
//
//    public int getTravelPrice() {
//        return travelPrice;
//    }
//
//    public int getTravelTime() {
//        return travelTime;
//    }
//
//    public String getDepartureStationName() {
//        return departureStationName;
//    }
//
//    public String getEndStation() {
//        return endStation;
//    }
//
//    public int getNumberOfCars() {
//        return numberOfCars;
//    }
//
//    public void startMoving(){
//        System.out.println("начало движения");
//    }
//    public void finishMoving(){
//        System.out.println("конец движения");
//    }
//
//    @Override
//    public boolean undergoDiagnostics() {
//        return false;
//    }
//    @Override
//    public void fixAuto() {
//        System.out.println("Поезд " + getBrand() + " " + getModel() + " починен") ;
//    }
//
//}
