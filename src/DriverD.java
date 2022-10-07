
import transport.Bus;
import transport.Car;
import transport.Competing;
import transport.Transport;

public class DriverD extends Driver<Bus>{

    public DriverD(String name, String typeDriverLicense, int experience, Bus bus) {
        this.name = name;
        this.typeDriverLicense = typeDriverLicense;
        this.Experience = experience;
        this.transport = bus;
    }

    @Override
    public String getName() {
        return name;
    }
}
