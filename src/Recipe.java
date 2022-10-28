import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Recipe {
    private String name;
    private Map<Product,Integer> productList;
    private int amount;

    public Recipe(String name, Map<Product,Integer> productList) {
        this.name = name;
        this.productList = productList;
        int amount = 0;
        for(Map.Entry<Product,Integer> product:productList.entrySet()){
            amount+=product.getKey().getAmount();
        }
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Map<Product,Integer> getProductList() {
        return productList;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductList(Map<Product,Integer> productList) {
        this.productList = productList;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                ", amount=" + amount +
                '}';
    }
}
