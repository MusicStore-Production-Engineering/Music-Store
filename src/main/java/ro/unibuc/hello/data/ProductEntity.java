package ro.unibuc.hello.data;

import org.springframework.data.annotation.Id;




public class ProductEntity {

    @Id
    public String id;

    public String productName;    
    public String description;
    public String categories;

    public ProductEntity() {}

    public ProductEntity(String Id, String productName, String description, String categories) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.categories = categories;
    }


    @Override
    public String toString() {
        return String.format(
                "Product[productName='%s', description='%s', categories='%s']",
                id, productName, description, categories);
    }

}