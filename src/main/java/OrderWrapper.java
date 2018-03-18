/**
 * Created by kasia on 18.03.18.
 */
public class OrderWrapper {
    private Order order;

    OrderWrapper(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "OrderWrapper{" +
                "order=" + order +
                '}';
    }
}
