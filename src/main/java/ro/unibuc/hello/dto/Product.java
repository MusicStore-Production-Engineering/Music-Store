package ro.unibuc.hello.dto;

public class Product{

    private long id;
    private String productName;
    private String description;
    private String categories;

    public Product() {
    }

    public Product(long id, String productName, String description, String categories) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.categories =  categories;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getCategories() {
        return categories;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName()
    {
        return productName;
    }

}