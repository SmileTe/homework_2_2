package animals;

import java.util.Objects;

public class Serpentine extends Animal{
    private String livingEnvironment;

    public Serpentine(String name, int numberOfYears, String livingEnvironment) {
        super(name, numberOfYears);
      setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Не задано";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public static void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public String toString() {
        return super.toString() + " Serpentine{" +
                "livingEnvironment='" + getLivingEnvironment() + '\'' +
                "} ";
    }

    @Override
    public  void eat() {
        System.out.println("Покормить мышами/насекомыми");
    }

    @Override
    public  void go() {
        System.out.println("Переместить в норку");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serpentine that = (Serpentine) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
