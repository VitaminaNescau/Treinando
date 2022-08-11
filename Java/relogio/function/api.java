package relogio.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import java.io.InputStreamReader;

public class api {
    locale info;
    public locale acess(){
        String key = "dd00af96";
        String site = "https://api.hgbrasil.com/weather?key="+key+"&user_ip=remote";
      
        try {
            URL url = new URL(site);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
              if (con.getResponseCode() != 200) {
                 throw new RuntimeException("ERRO:"+con.getResponseCode());
                 //RuntimeException é a checagem, se der erro é possivel conserta 
                } 
            BufferedReader json = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String JsonString = Util(json);
            Gson gson = new Gson();
            info = gson.fromJson(JsonString, locale.class);
            // aqui a class locale recebeu os dados do json
           

        } catch (Exception e) {
            e.printStackTrace();;
        }  return info;

    }
    //convertendo json em string
    public static String Util(BufferedReader buff) throws IOException{
        String r,JS = "";
        while ((r=buff.readLine()) != null) {
            JS += r;
        }
        return JS;
    }
}
