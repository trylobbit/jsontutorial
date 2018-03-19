import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by kasia on 19.03.18.
 */
public class JSONWriter {
    private String targetPath;

    JSONWriter(String targetPath) {
        this.targetPath = targetPath;
    }

    public void writeJSON(OrderAnalysis orderAnalysis) {

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter(targetPath)) {
            gson.toJson(orderAnalysis, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
