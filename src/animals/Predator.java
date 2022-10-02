package animals;

import java.util.Objects;

public class Predator extends Mammal{
    private String typeOfFood;

    public Predator(String name, int numberOfYears, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, numberOfYears, livingEnvironment, travelSpeed);
       setTypeOfFood(typeOfFood);
    }

    public static void hunt() {
        System.out.println("Охотиться");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Не задано";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Predator{" +
                "TypeOfFood='" + getTypeOfFood() + '\'' +
                "} " ;
    }

    @Override
    public  void eat() {
        System.out.println("Покормить насекомыми");
    }

    @Override
    public  void go() {
        System.out.println("Переместить в норку");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return typeOfFood.equals(predator.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }
}
