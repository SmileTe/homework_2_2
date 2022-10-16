public class Mechanic {
    String name;
    String company;
    String typeAuto;

    public Mechanic(String name, String company, String typeAuto) {
        this.name = name;
        this.company = company;
        this.typeAuto = typeAuto;
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

    public String getTypeAuto() {
        return typeAuto;
    }

    public void setTypeAuto(String typeAuto) {
        this.typeAuto = typeAuto;
    }
}

