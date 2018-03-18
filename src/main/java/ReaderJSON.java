import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by kasia on 18.03.18.
 */
public class ReaderJSON {
    private String filePath;

    ReaderJSON(String filePath) {
        this.filePath = filePath;
    }


    public Order readFile() {
        Order order = null;
        Gson gson = new Gson();

        try (Reader reader = new FileReader(filePath)) {

            OrderWrapper orderWrapper = gson.fromJson(reader, OrderWrapper.class);
            System.out.println(orderWrapper);
            order = orderWrapper.getOrder();


        } catch (IOException e) {
            e.printStackTrace();

        }

        return order;
    }

}