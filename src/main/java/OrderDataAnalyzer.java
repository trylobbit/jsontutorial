import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by kasia on 18.03.18.
 */
public class OrderDataAnalyzer {
    public void analyze(String dataSource) {
        ReaderJSON readerJSON = new ReaderJSON(dataSource);
        Order order = readerJSON.readFile();
        PurchaserDetailsProvider purchaserDetailsProvider = new PurchaserDetailsProvider();
        purchaserDetailsProvider.printPurchaserDetails(order);
        ProductsDetailsProvider productsDetailsProvider = new ProductsDetailsProvider();
        List<Product> productList = order.getProducts();
        BigDecimal sum = productsDetailsProvider.orderSum(productList);
        System.out.println(sum);
        Map<String, Integer> group = productsDetailsProvider.productsGroup(productList);
        System.out.println(group);
        Map<String, BigDecimal> groupSum = productsDetailsProvider.productsGroupSum(productList);
        System.out.println(groupSum);
        String bestseller = productsDetailsProvider.bestsellerGroup(productList);
        System.out.println(bestseller);
    }
}
