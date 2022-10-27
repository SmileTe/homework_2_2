package transport;

import java.util.Objects;

public class Sponsor {
    private String name;
    private int sumSupport;

    public Sponsor(String name, int sumSupport) {
        this.name = name;
        this.sumSupport = sumSupport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumSupport() {
        return sumSupport;
    }

    public void setSumSupport(int sumSupport) {
        this.sumSupport = sumSupport;
    }

    public void SponsorCheckIn(){
        System.out.printf("Заезд проспонсирован %s на сумму %d !",name, sumSupport);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", sumSupport=" + sumSupport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
