package animals;

import java.util.Objects;

public class Mammal extends Animal{
    private  String livingEnvironment;
    private  int travelSpeed;

    public Mammal(String name, int numberOfYears, String livingEnvironment, int travelSpeed) {
        super(name, numberOfYears);
       setLivingEnvironment(livingEnvironment);
        setTravelSpeed(travelSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Не задано";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void setTravelSpeed(int travelSpeed) {
        if(travelSpeed < 0) {
            this.travelSpeed = 0;
        } else {
            this.travelSpeed = travelSpeed;}
    }

    public static void walk() {
        System.out.println("Выгулять");
    }

    @Override
    public String toString() {
        return super.toString() + " Mammal{" +
                "livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", travelSpeed=" + getLivingEnvironment() +
                '}' ;
    }

}
