import transport.Drivers.Driver;
import transport.Drivers.DriverA;
import transport.Drivers.DriverC;
import transport.Drivers.DriverD;
import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;
import animals.Flightless;
import animals.Flyng;
import animals.Herbivory;
import animals.Predator;
import transport.*;
import transport.category.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
       // task10();
        task11();
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
//
//        Car ladaGrande = new Car("Lada", "Grande", 1.7, "желтый", 2017, "Россия", "", 0);
//        ladaGrande.setRegistrationNumber("х091хх020");
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "", 0);
//        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Южная Корея", "", 0);
//        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "", 0);
//
//        System.out.println(ladaGrande);
//        ladaGrande.refill();
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(hyundai);
//
//        Car.Insurance insurance1 = new Car.Insurance(2021, 2000, "25vvhhhh0");
//        Car.Insurance insurance2 = new Car.Insurance(2022, 2500, "05vvhhhh0");
//        Car.Insurance insurance3 = new Car.Insurance(2025, 3000, "25vv89hh0");
//        Car.Insurance insurance4 = new Car.Insurance(2030, 3500, "72vvhhhh0");
//
//        if (Car.Insurance.DurationIsOverdue(insurance1.getDuration())) {
//            System.out.println("нужно срочно ехать оформлять новую страховку.");
//        }
//        ladaGrande.insurance = insurance1;
//        audi.insurance = insurance2;
//        bmw.insurance = insurance3;
//        hyundai.insurance = insurance4;
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

//        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", "", 3500, 0, "Белорусский вокзал", "станция Минск-Пассажирская", 11, 301);
//        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "", 1700, 0, "Ленинградский вокзал", "станция Ленинград-Пассажирская", 8, 270);
//
//        System.out.println("lastochka = " + lastochka);
//        System.out.println("leningrad = " + leningrad);
//        lastochka.refill();
    }
    public static void task5() {
//
//        Bus bus1 = new Bus("ГАЗ", "Б-52", 2005, "Россия", "голубой");
//        Bus bus2 = new Bus("ВАЗ", "М-05", 2000, "Россия", "желтый");
//        Bus bus3 = new Bus("Буханка", "Т-04", 1960, "Россия", "серый");
//
//        System.out.println("bus1 = " + bus1);
//        System.out.println("bus2 = " + bus2);
//        System.out.println("bus3 = " + bus3);
//        bus1.refill();
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
        Car car1 = new Car("Лада", "Гранта", 1500, Car.TypeBody.SEDAN);
        Car car2 = new Car("Ford", "Focus", 3000, Car.TypeBody.SEDAN);
        Car car3 = new Car("Toyota", "Camry", 3500, Car.TypeBody.SEDAN);
        Car car4 = new Car("Kia", "Rio", 2000, Car.TypeBody.SEDAN);

        printCompeting(car1);
        printCompeting(car2);
        printCompeting(car3);
        printCompeting(car4);

        //грузовые
        Truck track1 = new Truck("ГАЗ", "Газель", 3000, Truck.LoadType.N1);
        Truck track2 = new Truck("ЗИЛ", "Бычок", 3000, Truck.LoadType.N1);
        Truck track3 = new Truck("КамАз", "5321", 3000, Truck.LoadType.N1);
        Truck track4 = new Truck("DAF", "LF", 4000, Truck.LoadType.N1);

        printCompeting(track1);
        printCompeting(track2);
        printCompeting(track3);
        printCompeting(track4);

        //автобусы
        Bus bus1 = new Bus("ГАЗ", "4555", 2000, Bus.TypeCapacity.Medium);
        Bus bus2 = new Bus("МАЗ", "232", 2500, Bus.TypeCapacity.Medium);
        Bus bus3 = new Bus("Лиаз", "4292", 2100, Bus.TypeCapacity.Medium);
        Bus bus4 = new Bus("УАЗ", "Родник", 4500, Bus.TypeCapacity.Medium);

        printCompeting(bus1);
        printCompeting(bus2);
        printCompeting(bus3);
        printCompeting(bus4);

//        Driver<Car> driverCar = new DriverA("водитель легкового авто", "A", 5, car1);
//        Driver<Truck> driverTruck = new DriverC("водитель грузового авто", "C", 15, track1);
//        Driver<Bus> driverBus = new DriverD("водитель автобуса", "D", 25, bus3);
//
//        printInformation(driverCar.getTransport(), driverCar);
//        printInformation(driverTruck.getTransport(), driverBus);
//        printInformation(driverBus.getTransport(), driverTruck);

    }

    public static void printCompeting(Competing transport) {
        System.out.println(transport);
        transport.pitStop();
        transport.bestLapTime();
        transport.maxSpeed();
    }

    public static void printInformation(Transport  t, Driver driver) {
        System.out.println("Водитель " + driver.getName() +
                " управляет автомобилем " + t.getBrand() +
                " и будет участвовать в заезде");
        t.printType();
    }
    public static void task8() {
        try {
            Login.check("we", "we***", "fdf");
        } catch (WrongPasswordException e) {
            System.out.println("Проверьте введенный пароль");
        } catch (WrongLoginException e) {
            System.out.println("Проверьте введенный логин");
        } finally {
            System.out.println("Проверка завершена");
        }

    }

    public static void task9() {
//        Car car1 = new Car("Лада", "Гранта", 1500, Car.TypeBody.SEDAN);
//        Truck track1 = new Truck("ГАЗ", "Газель", 3000, Truck.LoadType.N1);
//        Bus bus3 = new Bus("Лиаз", "4292", 2100, Bus.TypeCapacity.Medium);
//
//        Driver<Car> driverCar = new DriverA("водитель легкового авто", "A", 5, car1);
//        Driver<Truck> driverTruck = new DriverC("водитель грузового авто", "C", 15, track1);
//        Driver<Bus> driverBus = new DriverD("водитель лавтобуса", "D", 25, bus3);
//
//        checkDriver(driverCar, driverBus, driverTruck);
    }

    public static void task10() {

        //Задание 1
        Car car1 = new Car("Лада", "Гранта", 1500, Car.TypeBody.SEDAN);
        Truck truck1 = new Truck("ГАЗ", "Газель", 3000, Truck.LoadType.N1);
        Bus bus1 = new Bus("Лиаз", "4292", 2100, Bus.TypeCapacity.Medium);

        Driver<Car> driverCar = new DriverA("водитель легкового авто", true, 5,  new CategoryA("A"));
        Driver<Truck> driverTruck = new DriverC("водитель грузового авто", true, 15,  new CategoryC("C"));
        Driver<Bus> driverBus = new DriverD("водитель лавтобуса", true, 25,  new CategoryD("D"));

        Sponsor oleg = new Sponsor("Oleg",50 );
        Sponsor petr = new Sponsor("Petr",100 );
        Sponsor semen = new Sponsor("Semen",150 );

        Mechanic mechanicCar1 = new Mechanic<Car>("Механик по автомобилям младший", "Danone");
        Mechanic mechanicBus1 = new Mechanic("Механик по автобусам младший", "Danone");
        Mechanic mechanicTruck1 = new Mechanic("Механик по грузовикам младший", "Danone");

        car1.addDriver(driverCar);
        car1.addMechanic(mechanicCar1);
        car1.addSponsor(oleg, petr);

        truck1.addDriver(driverTruck);
        truck1.addMechanic(mechanicTruck1);
        truck1.addSponsor(petr,semen);

        bus1.addDriver(driverBus);
        bus1.addMechanic(mechanicBus1);
        bus1.addSponsor(oleg, petr,semen);

        //list cars
        LinkedList<Transport> listCars = new LinkedList<>();
        listCars.add(car1);
        listCars.add(truck1);
        listCars.add(bus1);

        //list drivers

        LinkedList<Driver> listDrivers1 = new LinkedList<>();
        listDrivers1.add(driverCar);
        listDrivers1.add(driverTruck);
        listDrivers1.add(driverBus);


        //list sponsor
        LinkedList<Sponsor> listSponsors1 = new LinkedList<>();
        listSponsors1.add(oleg);
        listSponsors1.add(petr);
        listSponsors1.add(semen);

        //list mechanics
        LinkedList<Mechanic> listMechanic1 = new LinkedList<>();
        listMechanic1.add(mechanicCar1);
        listMechanic1.add(mechanicBus1);
        listMechanic1.add(mechanicTruck1);

        for (Transport transport:listCars) {
            printInformationAboutTransport(transport);
        }


        //Задание 2
        Queue<Transport> queue = new LinkedList<>();

        ServiceStation serviceStation1 = new ServiceStation();

        serviceStation1.addCariInQueue(car1);
        serviceStation1.addTruckInQueue(truck1);
        serviceStation1.service();
        serviceStation1.service();


        Queue<String> queue1 = new LinkedList<>();
        for (int i = 1; i <=5; i++) {
            queue1.add("" +  i);
         }
        Queue<String> queue2 = new LinkedList<>();
        for (int i = 5; i <=10; i++) {
            queue2.add("" +  i);
        }
       addManInQueue(queue1,queue2, "5");


        //задание 3
        List<List<String>> biDemArrList = new ArrayList<>();
        boolean r = true;
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
              for (int j = 0; j < 8; j++) {
                  if(r){
                biDemArrList.get(i).add(j, "◯");
                      }
                  else { biDemArrList.get(i).add(j, "●");
                     }
                  r = !r;
              }
            r = !r;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

    public static void task11(){

        //task1
        ArrayList<Product> products = new ArrayList<Product>();
        Product banana = new Product("Бананы",  70, 1);
        Product banana1 = new Product("Бананы",  70, 1);
        Product cherry = new Product("Вишня", 100, 0.5);
        Product potato = new Product("Картофель", 150, 10);
        addInArrayList(products, banana);
       // addInArrayList(products, banana1);
        addInArrayList(products, cherry);
        addInArrayList(products, potato);

        int bananaIndex = products.indexOf(banana);
        products.get(bananaIndex).setBought(true);

        for (int i = 0; i < products.size(); i++) {
         if(products.get(i).isBought()){
             deleteFromArrayList(products, products.get(i));
         }
        }
        //System.out.println(Arrays.toString(products.toArray()));

        //задание 2

        /// рецепт 1
        Product cookie = new Product("Печенье", 150, 200);
        Product condencedMilk = new Product("сгущенное молоко", 200, 200);
        Product cocoa = new Product("Какао", 150, 200);
        List<Product> arrayForPotato  = new ArrayList<>();
        addInArrayList(arrayForPotato, cookie);
        addInArrayList(arrayForPotato, condencedMilk);
        addInArrayList(arrayForPotato, cocoa);


        /// рецепт 2
        Product sausage = new Product("Колбаса", 150, 200);
        Product butter = new Product("масло", 200, 200);
        Product bread = new Product("хлеб", 150, 200);
        List<Product> arrayForSandwich  = new ArrayList<>();
        addInArrayList(arrayForSandwich, sausage);
        addInArrayList(arrayForSandwich, butter);
        addInArrayList(arrayForSandwich,  bread);


        ArrayList<Recipe> arrayRecipes= new ArrayList<>();
        addInArrayListRecipe(arrayRecipes, new Recipe("Пирожное картошка",arrayForPotato,600));
        addInArrayListRecipe(arrayRecipes, new Recipe("Бутерброд",arrayForSandwich,600));

        //задание 3

        Random rand = new Random();
        ArrayList<Integer> array= new ArrayList<>();
        //заполнение
        for (int i = 0; i < 20; i++) {
            array.add(rand.nextInt(1000));
        }
        //удаление
        for (int i = array.size()-1; i >=0; i--) {
            if(array.get(i)%2==1){
                array.remove(i);
            }
        }
        System.out.println(Arrays.toString(array.toArray()));

        //задание 4
        Car car1 = new Car("Лада", "Гранта", 1500, Car.TypeBody.SEDAN);
        Truck truck1 = new Truck("ГАЗ", "Газель", 3000, Truck.LoadType.N1);
        Bus bus1 = new Bus("Лиаз", "4292", 2100, Bus.TypeCapacity.Medium);

        Driver<Car> driverCar = new DriverA("водитель легкового авто", true, 5,  new CategoryA("A"));
        Driver<Truck> driverTruck = new DriverC("водитель грузового авто", true, 15,  new CategoryC("C"));
        Driver<Bus> driverBus = new DriverD("водитель лавтобуса", true, 25,  new CategoryD("D"));

        Sponsor oleg = new Sponsor("Oleg",50 );
        Sponsor petr = new Sponsor("Petr",100 );
        Sponsor semen = new Sponsor("Semen",150 );

        Mechanic mechanicCar1 = new Mechanic<Car>("Механик по автомобилям младший", "Danone");
        Mechanic mechanicBus1 = new Mechanic("Механик по автобусам младший", "Danone");
        Mechanic mechanicTruck1 = new Mechanic("Механик по грузовикам младший", "Danone");

        car1.addDriver(driverCar);
        car1.addMechanic(mechanicCar1);
        car1.addSponsor(oleg, petr);

        truck1.addDriver(driverTruck);
        truck1.addMechanic(mechanicTruck1);
        truck1.addSponsor(petr,semen);

        bus1.addDriver(driverBus);
        bus1.addMechanic(mechanicBus1);
        bus1.addSponsor(oleg, petr,semen);

        //list cars
        Set <Transport> listCars = new HashSet<>();
        listCars.add(car1);
        listCars.add(truck1);
        listCars.add(bus1);

        //list drivers

        Set<Driver> listDrivers1 = new HashSet<>();
        listDrivers1.add(driverCar);
        listDrivers1.add(driverTruck);
        listDrivers1.add(driverBus);


        //list sponsor
        Set<Sponsor> listSponsors1 = new HashSet<>();
        listSponsors1.add(oleg);
        listSponsors1.add(petr);
        listSponsors1.add(semen);

        //list mechanics
        Set<Mechanic> listMechanic1 = new HashSet<>();
        listMechanic1.add(mechanicCar1);
        listMechanic1.add(mechanicBus1);
        listMechanic1.add(mechanicTruck1);


        for (Transport transport:listCars) {
            System.out.println(transport);

        }



    }
    public static  void addInArrayList(List array, Product newProduct) {
          if(array.contains(newProduct)){
            throw new ArrayStoreException();
          }
          else {
              array.add(newProduct);
          }


    }

    public static  void addInArrayListRecipe(ArrayList array, Recipe newRecipe) {
        if(array.contains(newRecipe)){
            throw new ArrayStoreException();
        }
        else {
            array.add(newRecipe);
        }


    }

    public static  void deleteFromArrayList(ArrayList array, Product product) {
        array.remove(product);
    }

    public static void printInformationAboutTransport(Transport transport){
        System.out.printf("Информация  по ТС:%1s %2s " ,transport.getBrand(), transport.getModel());
        System.out.println("");
        System.out.println("Водители: " );
        for  (Driver<?> driver:transport.getDrivers()){
            System.out.println("driver = " + driver);
        }

        System.out.println("Спонсоры: " );
        for  (Sponsor sponsor:transport.getSponsors()){
            System.out.println("sponsor = " + sponsor);
        }

        System.out.println("Механики : " );
        for  (Mechanic<?> mechanic:transport.getMechanics()){
            System.out.println("mechanic = " + mechanic) ;
        }
        System.out.println("");
    }


   public static void addManInQueue(Queue<String> queue1, Queue<String> queue2, String newMan) {
            if (queue1.size() > queue2.size()) {
                queue2.add(newMan);
            } else if (queue2.size() > queue1.size()) {
                queue1.add(newMan);
            }
}
}