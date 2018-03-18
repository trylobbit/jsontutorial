/**
 * Created by kasia on 18.03.18.
 */
public class Address {
    private String street;
    private Boolean isActual;

    Address(String street, Boolean isActual) {
        this.isActual = isActual;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public Boolean isActual() {
        return isActual;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", isActual=" + isActual +
                '}';
    }
}
