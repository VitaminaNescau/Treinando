package relogio.function;

import com.google.gson.annotations.SerializedName;

public class locale {
   //entendi q @serializedName é da biblioteca gson, ela serve pra definir oq vou puxar do json
    @SerializedName("city")
    private String city;
    @SerializedName("date")
    private String date;
    @SerializedName("description")
    private String description;
    @SerializedName("temp")
    private int temp;
    //esse result é pq a api esta encapsulada, preciso acessar o results para ter as informações, mas não entendi muito bem 
    private locale results;
    
    public locale getResults(){
        return results;
    }
    @Override
    public String toString(){
        return city+" "+date+" "+description+" "+temp+"°C";
    }
    
  

}
