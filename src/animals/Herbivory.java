package animals;

import java.util.Objects;

public class Herbivory extends Mammal{
    private String typeOfFood;

    public Herbivory(String name, int numberOfYears, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, numberOfYears, livingEnvironment, travelSpeed);
        setTypeOfFood(typeOfFood);
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
    public static void Graze() {
        System.out.println("Пастись");
    }

    @Override
    public String toString() {
        return super.toString() + " Herbivory{" +
                "TypeOfFood='" + getTypeOfFood() + '\'' +
                  "} " ;
    }

    @Override
    public void eat() {
        System.out.println("Покормить травой");
    }
    @Override
    public void go() {
        System.out.println("Переместить в стаю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivory herbivory = (Herbivory) o;
        return typeOfFood.equals(herbivory.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
