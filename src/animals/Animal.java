package animals;

public class Animal {
    private  String name;
    private int numberOfYears;

    public Animal(String name, int numberOfYears) {
       setName(name);
       setNumberOfYears(numberOfYears);
    }

    public String getName() {
        return name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;}
    }

    public void setNumberOfYears(int numberOfYears) {
        if(numberOfYears < 0) {
            this.numberOfYears = 0;
        } else {
            this.numberOfYears = numberOfYears;}
    }

    public  void eat() {
        System.out.println("Покормить");
    }

    public  void sleep() {
        System.out.println("Поместить на лежанку");
    }

    public  void go() {
        System.out.println("Переместить");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", numberOfYears=" + getNumberOfYears() +
                '}';
    }
}
