package relogio.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;



public class dateANDlocale {

   public static void main(String[] args) {
        dateANDlocale teste = new dateANDlocale();
        teste.acess();
        
    }
    
    public void acess(){
        String SITE = "https://api.hgbrasil.com/weather?format=json-cors&key="; 
        String key ="dd00af96";
      
        try {
            URL url = new URL(SITE);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            if (con.getResponseCode() == 200) {
                System.out.println("Sucesso "+con.getResponseCode() );
            }else{
                System.out.println("Falho "+con.getResponseCode());
            }
            BufferedReader json = new BufferedReader(new InputStreamReader(con.getInputStream()));
            dateANDlocale JSON = new dateANDlocale();
            String JsonString = JSON.Util(json);
            Gson teste = new Gson();
            locale teste1 = teste.fromJson(JsonString, locale.class);
            System.out.println(teste1.getCity());
        }
         catch (Exception e) {
          System.out.println("ERRO: "+e);
        }
        //return teste1;
        

    }
    public String Util(BufferedReader buff) throws IOException{
        String r,JS = "";
        while ((r=buff.readLine()) != null) {
            JS += r;
        }
        return JS;
    }
}
