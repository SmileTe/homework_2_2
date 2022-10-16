package animals;

import java.util.Objects;

public class Flightless extends Bird{
    private  String movementType;

    public Flightless(String name, int numberOfYears, String livingEnvironment, String movementType) {
        super(name, numberOfYears, livingEnvironment);
       setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isEmpty() || movementType.isBlank()) {
            this.movementType = "ходьба";
        } else {
            this.movementType = movementType;
        }
    }

    public static void walk() {
        System.out.println("Гулять");
    }

    @Override
    public String toString() {
        return super.toString() + " Flightless{" +
                "movementType='" + getMovementType() + '\'' +
                "} " ;
    }

    @Override
    public void eat() {
        System.out.println("Покормить рыбой/мелкими грызунами");
    }

    @Override
    public void go() {
        System.out.println("Положить в гнездо");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementType);
    }
}
