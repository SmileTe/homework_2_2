package animals;

import java.util.Objects;

public class Flyng extends Bird{
    private String movementType;

    public Flyng(String name, int numberOfYears, String livingEnvironment, String movementType) {
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

    public static void fly() {
        System.out.println("Летать");
    }

    @Override
    public String toString() {
        return super.toString()
        + " Flyng{" +
                "movementType='" + getMovementType() + '\'' +
                "} " ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flyng flyng = (Flyng) o;
        return Objects.equals(movementType, flyng.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementType);
    }
}

