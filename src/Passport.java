import java.util.Objects;

public class Passport {
    private int numberPassport;
    private String name;
    private String dateBirthday;

    public Passport(int numberPassport, String name, String dateBirthday) {
        this.numberPassport = numberPassport;
        this.name = name;
        this.dateBirthday = dateBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return numberPassport == passport.numberPassport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numberPassport=" + numberPassport +
                ", name='" + name + '\'' +
                ", dateBirthday='" + dateBirthday + '\'' +
                '}';
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    public String getName() {
        return name;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }
}
