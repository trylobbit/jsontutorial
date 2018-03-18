/**
 * Created by kasia on 18.03.18.
 */

import java.util.List;

public class Purchaser {
    private List<Address> addresses;
    private String first_name;
    private String last_name;

    Purchaser(String first_name, String last_name, List<Address> addresses) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    @Override
    public String toString() {
        return "Purchaser{" +
                "addresses=" + addresses +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
