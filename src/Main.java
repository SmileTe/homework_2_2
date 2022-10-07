import animals.Flightless;
import animals.Flyng;
import animals.Herbivory;
import animals.Predator;
import transport.*;

import javax.sound.midi.Track;

public class Main {
    public static void main(String[] args) {

        // task1();
        //task2();
        // task3();
        //task4();
        //task5();
      //  task6();
        task7();

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
        ladaGrande.refill();
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(hyundai);

        Car.Insurance insurance1 = new Car.Insurance(2021, 2000, "25vvhhhh0");
        Car.Insurance insurance2 = new Car.Insurance(2022, 2500, "05vvhhhh0");
        Car.Insurance insurance3 = new Car.Insurance(2025, 3000, "25vv89hh0");
        Car.Insurance insurance4 = new Car.Insurance(2030, 3500, "72vvhhhh0");

        if (Car.Insurance.DurationIsOverdue(insurance1.getDuration())) {
            System.out.println("нужно срочно ехать оформлять новую страховку.");
        }
        ladaGrande.insurance = insurance1;
        audi.insurance = insurance2;
        bmw.insurance = insurance3;
        hyundai.insurance = insurance4;
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
        buket[0] = new Flower.Buket(rose, 3);
        buket[1] = new Flower.Buket(chrisantema, 5);
        buket[2] = new Flower.Buket(gipsofila, 1);

        double sum = 0;
        int lifeSpan = 0;

        for (int i = 0; i < buket.length; i++) {
            if (buket[i] != null) {
                double cost = buket[i].getFlower().getCost();
                sum = sum + (cost * buket[i].getCount());
                if (lifeSpan < buket[i].getFlower().getLifeSpan()) {
                    lifeSpan = buket[i].getFlower().getLifeSpan();
                }
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("lifeSpan = " + lifeSpan);
    }

    public static void task4() {

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", "", 3500, 0, "Белорусский вокзал", "станция Минск-Пассажирская", 11, 301);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "", 1700, 0, "Ленинградский вокзал", "станция Ленинград-Пассажирская", 8, 270);

        System.out.println("lastochka = " + lastochka);
        System.out.println("leningrad = " + leningrad);
        lastochka.refill();
    }
    public static void task5() {

        Bus bus1 = new Bus("ГАЗ", "Б-52", 2005, "Россия", "голубой");
        Bus bus2 = new Bus("ВАЗ", "М-05", 2000, "Россия", "желтый");
        Bus bus3 = new Bus("Буханка", "Т-04", 1960, "Россия", "серый");

        System.out.println("bus1 = " + bus1);
        System.out.println("bus2 = " + bus2);
        System.out.println("bus3 = " + bus3);
        bus1.refill();
    }
    public static void task6() {

        //травоядные
        Herbivory gazellle = new Herbivory("Газелюшка", 5,"пустыня", 50, "трава");
        Herbivory giraffe = new Herbivory("Жирафик", 4,"саванна", 50, "трава");
        Herbivory horse = new Herbivory("Лошадка", 10,"степь", 50, "трава");
        System.out.println("gazellle = " + gazellle);
        System.out.println("giraffe = " + giraffe);
        System.out.println("horse = " + horse);

        //хищники
        Predator hyena = new Predator("Гиенушка", 4, "пустыня", 50, "мясо");
        Predator tiger = new Predator("Тигра", 4, "лес", 50, "мясо");
        Predator bear = new Predator("Мишка", 4, "лес", 50, "мясо");

        System.out.println("hyena = " + hyena);
        System.out.println("tiger = " + tiger);
        System.out.println("bear = " + bear);

        //земноводные
        Predator frog = new Predator("Лягушонок", 2, "водоём", 50, "насекомые");
        Predator diceSnake = new Predator("Ужик", 1, "водоём", 50, "рыба");

        System.out.println("frog = " + frog);
        System.out.println("diceSnake = " + diceSnake);

        //нелетающие
        Flightless peacock = new Flightless("Павлинчик", 5, "джунгли","ходьба");
        Flightless penguin = new Flightless("Пингвинчик", 5, "ледник","ходьба");
        Flightless dodo = new Flightless("Додошка", 5, "вулканический остров","ходьба");

        System.out.println("peacock = " + peacock);
        System.out.println("penguin = " + penguin);
        System.out.println("dodo = " + dodo);

        //летающие
        Flyng gull = new Flyng("Чаечка",3, "прибрежная территория", "летать");
        Flyng albatross = new Flyng("Альбатросик",3, "остров", "летать");
        Flyng falcon = new Flyng("Соколик",3, "скалы", "летать");

        System.out.println("gull = " + gull);
        System.out.println("albatross = " + albatross);
        System.out.println("falcon = " + falcon);

    }

    public static void task7() {

        //легковые
        Car car1 = new Car("Лада", "Гранта", 1500);
        Car car2 = new Car("Ford", "Focus", 3000);
        Car car3 = new Car("Toyota", "Camry", 3500);
        Car car4 = new Car("Kia", "Rio", 2000);
        printCompeting(car1);
        printCompeting(car2);
        printCompeting(car3);
        printCompeting(car4);


        //грузовые
        Truck track1 = new Truck("ГАЗ", "Газель", 3000);
        Truck track2 = new Truck("ЗИЛ", "Бычок", 3000);
        Truck track3 = new Truck("КамАз", "5321", 3000);
        Truck track4 = new Truck("DAF", "LF", 4000);
        printCompeting(track1);
        printCompeting(track2);
        printCompeting(track3);
        printCompeting(track4);

        //автобусы
        Bus bus1 = new Bus("ГАЗ", "4555", 2000);
        Bus bus2 = new Bus("МАЗ", "232", 2500);
        Bus bus3 = new Bus("Лиаз", "4292", 2100);
        Bus bus4 = new Bus("УАЗ", "Родник", 4500);
        printCompeting(bus1);
        printCompeting(bus2);
        printCompeting(bus3);
        printCompeting(bus4);

        Driver<Car> driverCar = new Driver<>("водитель легкового авто", "A", 5, car1);
        Driver<Truck> driverTruck = new Driver<>("водитель грузового авто", "C", 15, track1);
        Driver<Bus> driverBus = new Driver<>("водитель лавтобуса", "D", 25, bus3);

        driverCar.printInformation(driverCar.getTransport());
        driverTruck.printInformation(driverTruck.getTransport());
        driverBus.printInformation(driverBus.getTransport());

    }



    public static void printCompeting(Competing transport) {
        System.out.println(transport);
        transport.pitStop();
        transport.bestLapTime();
        transport.maxSpeed();
    }

}