import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by kasia on 18.03.18.
 */
public class ProductsDetailsProvider {
    public BigDecimal orderSum(List<Product> products) {
        return products.stream()
                .map(product -> product.getPrice().multiply(new BigDecimal(product.getQuantity())))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);

    }

    public Map<String, Integer> productsGroup(List<Product> products) {
        return products.stream()
                .collect(Collectors.toMap(Product::getGroup, Product::getQuantity,
                        (integer, integer2) -> integer + integer2));

    }

    public Map<String, BigDecimal> productsGroupSum(List<Product> products) {
        return products.stream()
                .collect(Collectors.toMap(Product::getGroup, product -> product.getPrice().multiply(new BigDecimal(product.getQuantity())),
                        BigDecimal::add));
    }

    public String bestsellerGroup(List<Product> products) {
        Map<String, Integer> groupQuantityMap = productsGroup(products);
        return groupQuantityMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .get();


    }

    public String bestsellerProduct(List<Product> products) {
        return products.stream()
                .max(Comparator.comparing(Product::getQuantity))
                .map(Product::getName)
                .get();
    }

    public String dearestProductSearch(List<Product> products) {
        return products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .map(Product::getName)
                .get();
    }
}
