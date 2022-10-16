public class Sponsor {
    String name;
    int sumSupport;

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
}
