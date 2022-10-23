package transport;

//import transport.Train;
import transport.Transport;

public class Mechanic<T extends Transport> {
    private String name;
    private String company;
    //private String typeAuto;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean service(T auto) {
        return auto.undergoDiagnostics();
    }

    public void fixAuto(T auto) {
        auto.fixAuto();
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

