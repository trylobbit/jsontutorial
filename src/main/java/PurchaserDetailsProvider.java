/**
 * Created by kasia on 18.03.18.
 */

import java.util.List;

public class PurchaserDetailsProvider {

    public void printPurchaserDetails(Order order) {
        String firstName = order.getPurchaser().getFirst_name();
        String lastName = order.getPurchaser().getLast_name();
        Address actualAddress = null;
        List<Address> addresses = order.getPurchaser().getAddresses();

        for (Address adr : addresses) {
            if (adr.isActual()) {
                actualAddress = adr;
            }
        }
        System.out.println(firstName + ' ' + lastName + ' ' + actualAddress.getStreet());
    }
}
