/**
 * Created by kasia on 18.03.18.
 */
public class Main {


    public static void main(String[] args) {
        String dataSource = args[0];
        String targetPath = args[1];
        OrderDataAnalyzer orderDataAnalyzer = new OrderDataAnalyzer();
        orderDataAnalyzer.analyze(dataSource, targetPath);

    }
}
