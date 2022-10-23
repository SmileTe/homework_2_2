package transport;

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
}
