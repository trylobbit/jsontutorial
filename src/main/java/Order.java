/**
 * Created by kasia on 18.03.18.
 */

import java.util.List;

public class Order {

    private Purchaser purchaser;

    private List<Product> products;

    Order(Purchaser purchaser, List<Product> products) {
        this.products = products;
        this.purchaser = purchaser;
    }

    public Purchaser getPurchaser() {
        return purchaser;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "purchaser=" + purchaser +
                ", products=" + products +
                '}';
    }
}
