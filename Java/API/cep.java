package API;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class cep {
    static String webService = "http://viacep.com.br/ws/";
    static int codigoSucesso = 200;
        public static endereco BEP(String cep) throws Exception{
            String chamada = webService+cep+"/json";//linnk com o cep puxando um arquivo json
            try {
                URL url = new URL(chamada);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();// não sei para quer o (http) serve
                if(con.getResponseCode()!=codigoSucesso){
                   throw new RuntimeException("HTTP error code "+ con.getResponseCode());
                }
                BufferedReader resposta = new BufferedReader(new InputStreamReader((con.getInputStream()))); 
                String jsonEmString = Util.CJS(resposta);
                Gson gson = new Gson();
                endereco E = gson.fromJson(jsonEmString,endereco.class);
                return E;
            } catch (Exception e)  {
                throw new Exception("ERRO: " + e);
            }
            
        }
}
