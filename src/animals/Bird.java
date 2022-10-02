package animals;

import java.util.Objects;

public class Bird extends Animal{
   private String livingEnvironment;

    public Bird(String name, int numberOfYears, String livingEnvironment) {
        super(name, numberOfYears);
       setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "Не задано";
        } else {
            this.livingEnvironment = livingEnvironment;}
    }
    public static void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public String toString() {
        return super.toString() +
                " Bird{" +
                "livingEnvironment='" + getLivingEnvironment() + '\'' +
                "} ";
    }
    @Override
    public void eat() {
        System.out.println("Покормить рыбой");
    }


    public void go() {
        System.out.println("Переместить в гнездо");
    }


}
