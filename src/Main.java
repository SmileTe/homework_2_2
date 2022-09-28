import transport.Car;

public class Main {
    public static void main(String[] args) {

    task1();
    task2();
     task3();
    }

    public static void task1() {

        Human maxim = new Human("Максим", 1987, "Минск", "бренд-менеджер");
        Human anya = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1994, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 2001, "Казань", null);

        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

    }


    public static void task2() {

        Car ladaGrande = new Car("Lada", "Grande", 1.7, "желтый", 2017, "Россия", "", 0);
        ladaGrande.setRegistrationNumber("х091хх020");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "", 0);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Южная Корея", "", 0);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "", 0);

        System.out.println(ladaGrande);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(hyundai);
    }

    public static void task3() {

        Flower rose = new Flower("", "Голладия", 35.59, 0);
        Flower chrisantema = new Flower("", "", 15, 5);
        Flower pion = new Flower("", "Англия", 69.9, 1);
        Flower gipsofila = new Flower("", "Турция", 19.5, 10);

        System.out.println("rose = " + rose);
        System.out.println("chrisantema = " + chrisantema);
        System.out.println("pion = " + pion);
        System.out.println("gipsofila = " + gipsofila);

        //extra task
        Flower.Buket[] buket = new Flower.Buket[10];
        buket[0]= new Flower.Buket(rose, 3);
        buket[1]= new Flower.Buket(chrisantema, 5);
        buket[2]= new Flower.Buket(gipsofila, 1);

        double sum = 0;
        int lifeSpan = 0;

        for (int i = 0; i < buket.length; i++) {
           if(buket[i]!=null){
        double cost = buket[i].getFlower().getCost();
               sum = sum + (cost*buket[i].getCount());
                if(lifeSpan<buket[i].getFlower().getLifeSpan()){
                    lifeSpan =  buket[i].getFlower().getLifeSpan();
                }
           }
        }
        System.out.println("Sum = " + sum);
        System.out.println("lifeSpan = " + lifeSpan);
    }
}