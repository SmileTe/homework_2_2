public class Main {
    public static void main(String[] args) {

     task1();
     task2();
    }

    public static void task1() {

        Human maxim = new Human("Максим", 1987, "Минск", "бренд-менеджер");
        Human anya = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1994, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");

        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
    }


    public static void task2() {

        Car ladaGrande = new Car("Lada", "Grande", 1.7, "желтый", 2017, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(ladaGrande);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(hyundai);
    }
}