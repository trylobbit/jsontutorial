import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by kasia on 18.03.18.
 */
public class OrderDataAnalyzer {
    OrderAnalysis orderAnalysis = new OrderAnalysis();

    public void analyze(String dataSource, String targetPath) {
        ReaderJSON readerJSON = new ReaderJSON(dataSource);
        Order order = readerJSON.readFile();


        PurchaserDetailsProvider purchaserDetailsProvider = new PurchaserDetailsProvider();
        ActualPurchaserDetails actualPurchaserDetails = purchaserDetailsProvider.createPurchaserDetails(order);
        orderAnalysis.setActualPurchaserDetails(actualPurchaserDetails);
        ProductsDetailsProvider productsDetailsProvider = new ProductsDetailsProvider();
        List<Product> productList = order.getProducts();

        orderSum(productsDetailsProvider, productList);
        group(productsDetailsProvider, productList);
        groupSum(productsDetailsProvider, productList);
        bestseller(productsDetailsProvider, productList);
        bestsellerProduct(productsDetailsProvider, productList);
        dearestProductSearch(productsDetailsProvider, productList);

        JSONWriter jsonWriter = new JSONWriter(targetPath);
        jsonWriter.writeJSON(orderAnalysis);
    }

    private void orderSum(ProductsDetailsProvider productsDetailsProvider, List<Product> productList) {
        BigDecimal sum = productsDetailsProvider.orderSum(productList);
        orderAnalysis.setSumOfOrder(sum);

    }

    private void group(ProductsDetailsProvider productsDetailsProvider, List<Product> productList) {
        Map<String, Integer> group = productsDetailsProvider.productsGroup(productList);
        orderAnalysis.setGroupQuantity(group);
    }

    private void groupSum(ProductsDetailsProvider productsDetailsProvider, List<Product> productList) {
        Map<String, BigDecimal> groupSum = productsDetailsProvider.productsGroupSum(productList);
        orderAnalysis.setGroupPrice(groupSum);
    }

    private void bestseller(ProductsDetailsProvider productsDetailsProvider, List<Product> productList) {
        String bestseller = productsDetailsProvider.bestsellerGroup(productList);
        orderAnalysis.setBestsellerGroup(bestseller);

    }

    private void bestsellerProduct(ProductsDetailsProvider productsDetailsProvider, List<Product> productList) {
        String bestsellerProduct = productsDetailsProvider.bestsellerProduct(productList);
        orderAnalysis.setBestsellerProduct(bestsellerProduct);
    }

    private void dearestProductSearch(ProductsDetailsProvider productsDetailsProvider, List<Product> productList) {
        String dearestProduct = productsDetailsProvider.dearestProductSearch(productList);
        orderAnalysis.setDearestProduct(dearestProduct);
    }
}
