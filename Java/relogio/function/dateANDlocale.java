package relogio.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;



public class dateANDlocale {

   //metodo main para teste 
    public static void main(String[] args) {
        dateANDlocale teste = new dateANDlocale();
        teste.acess();
        
    }
    //metodo que consome a api
    public void acess(){
        String SITE = "https://api.hgbrasil.com/weather?format=json&key="; 
        String key ="dd00af96";
      
        try {
            URL url = new URL(SITE+key);
            HttpURLConnection con = (HttpURLConnection) /*pq o http esta em parentese e não como new?*/url.openConnection();
            if (con.getResponseCode() == 200) {
                System.out.println("Sucesso "+con.getResponseCode() );
            }else{
                System.out.println("Falho "+con.getResponseCode());
            }
            //ainda não entendi muito a utilização do buffer e o input
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
    //metodo q converte json para string 
    public String Util(BufferedReader buff) throws IOException{
        String r,JS = "";
        while ((r=buff.readLine()) != null) {
            JS += r;
        }
        return JS;
    }
}
