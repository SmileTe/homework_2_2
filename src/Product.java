import Exceptions.WrongDataException;

import java.util.Objects;


public class Product {
    private String name;
    private int price;
    private double amount;
    private boolean bought;

    public Product(String name, int price, double amount) {
        try {
            check(name, price, amount);
        } catch (WrongDataException e) {
            System.out.println("Заполните карточку товара полностью");
        }
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    public static void check(String name, int price, double amount) throws WrongDataException {

        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new WrongDataException();
        }
        if (price==0){
            throw new WrongDataException();
        }
        if (amount==0){
            throw new WrongDataException();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Price=" + price +
                ", Amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
