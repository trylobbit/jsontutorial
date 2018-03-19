import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by kasia on 19.03.18.
 */
public class OrderAnalysis {


    private ActualPurchaserDetails actualPurchaserDetails;
    private BigDecimal sumOfOrder;
    private Map<String, Integer> groupQuantity;
    private Map<String, BigDecimal> groupPrice;
    private String bestsellerGroup;
    private String bestsellerProduct;
    private String dearestProduct;


    public BigDecimal getSumOfOrder() {
        return sumOfOrder;
    }

    public void setSumOfOrder(BigDecimal sumOfOrder) {
        this.sumOfOrder = sumOfOrder;
    }

    public Map<String, Integer> getGroupQuantity() {
        return groupQuantity;
    }

    public void setGroupQuantity(Map<String, Integer> groupQuantity) {
        this.groupQuantity = groupQuantity;
    }

    public Map<String, BigDecimal> getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(Map<String, BigDecimal> groupPrice) {
        this.groupPrice = groupPrice;
    }

    public String getBestsellerGroup() {
        return bestsellerGroup;
    }

    public void setBestsellerGroup(String bestsellerGroup) {
        this.bestsellerGroup = bestsellerGroup;
    }

    public String getBestsellerProduct() {
        return bestsellerProduct;
    }

    public void setBestsellerProduct(String bestsellerProduct) {
        this.bestsellerProduct = bestsellerProduct;
    }

    public String getDearestProduct() {
        return dearestProduct;
    }

    public void setDearestProduct(String dearestProduct) {
        this.dearestProduct = dearestProduct;
    }

    public ActualPurchaserDetails getActualPurchaserDetails() {
        return actualPurchaserDetails;
    }

    public void setActualPurchaserDetails(ActualPurchaserDetails actualPurchaserDetails) {
        this.actualPurchaserDetails = actualPurchaserDetails;
    }
}
