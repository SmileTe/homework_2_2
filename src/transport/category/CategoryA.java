package transport.category;

public class CategoryA extends Category{
    //private String type;

    public CategoryA(String type) {
        this.type = type;
    }

    public String getType() {
        return super.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

