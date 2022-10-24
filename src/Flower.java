public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;


    public static class Buket{
        private Flower flower;
        private Integer count;

        public Buket(Flower flower, Integer count) {
            this.flower = flower;
            this.count = count;
        }

        public Flower getFlower() {
            return flower;
        }

        public Integer getCount() {
            return count;
        }

    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor==null||flowerColor.isEmpty()||flowerColor.isBlank()){
            this.flowerColor = "белый";
        }
        else { this.flowerColor = flowerColor;}
    }

    public void setCountry(String country) {
        if (country==null||country.isEmpty()||country.isBlank()){
            this.country = "Россия";
        }
        else { this.country = country;}

    }

    public void setCost(double cost) {
        if (cost<0){
            this.cost = 1;
        }
        else { this.cost = cost;}

    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        if(lifeSpan<0) {
            this.lifeSpan = 3;
        } else {this.lifeSpan = lifeSpan;}
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
