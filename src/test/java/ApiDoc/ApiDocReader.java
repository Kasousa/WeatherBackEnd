package ApiDoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApiDocReader {

    public static String[] Reader (String Index, String file) throws IOException {
    String baseDir = "src/test/java/ApiDoc/Resources/";
    BufferedReader csvReader = new BufferedReader(new FileReader(baseDir + file));
    String line;
    String[] data = null;
    while ((line = csvReader.readLine()) != null) {
        String[] lineSplited = line.split(",");
        if (Index.equals(lineSplited[0])){
            data=lineSplited;
            break;
        }
    }
    csvReader.close();
    return data;
    }
}
