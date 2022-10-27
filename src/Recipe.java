import java.util.List;
import java.util.Objects;

public class Recipe {
    private String name;
    private List<Product> productList;
    private int amount;

    public Recipe(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
        int amount = 0;
        for(Product product:productList){
            amount+=product.getAmount();
        }
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductList(List<Product> productList) {
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
}
