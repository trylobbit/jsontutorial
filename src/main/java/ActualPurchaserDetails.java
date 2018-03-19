/**
 * Created by kasia on 19.03.18.
 */
public class ActualPurchaserDetails {
    private String first_name;
    private String second_name;
    private String actualAddress;

    public ActualPurchaserDetails(String firstName, String secondName, String actualAddress) {
        first_name = firstName;
        second_name = secondName;
        this.actualAddress = actualAddress;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getActualAddres() {
        return actualAddress;
    }

    public void setActualAddres(String actualAddres) {
        this.actualAddress = actualAddres;
    }
}
