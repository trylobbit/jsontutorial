import java.math.BigDecimal;

/**
 * Created by kasia on 18.03.18.
 */
public class Product {
    private String id;
    private String name;
    private String title;
    private BigDecimal price;
    private String group;
    private Integer quantity;

    Product(String id, String name, String title, BigDecimal price, String group, Integer quantity) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
        this.group = group;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getGroup() {
        return group;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", group='" + group + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
