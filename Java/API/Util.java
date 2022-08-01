package API;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;

public class Util {
    public static String CJS(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}