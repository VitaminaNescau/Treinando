package relogio.function;

import com.google.gson.annotations.SerializedName;

public class forecast {
    @SerializedName("date")
    private String date;
    private forecast forecast[];
    private locale results;

    public locale getResults(){
        return results;
    }
    public forecast getForecast(){
        return forecast[0];
    }
    @Override
    public String toString(){
        return date;
    }
}
