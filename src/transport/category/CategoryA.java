package transport.category;

public class CategoryA extends Category{
    //private String type;

    public CategoryA(String type) {
       setType(type);
    }

    public String getType() {
        return super.getType();
    }

    public void setType(String type) {
        super.setType(type);
    }
}

