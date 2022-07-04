package Java.relogio;

import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class horas {
    public int h,m,s;
    public String hora;
    public Calendar time;

    public String getTime(){
        time = Calendar.getInstance();
        h = time.get(Calendar.HOUR_OF_DAY);
        m = time.get(Calendar.MINUTE);
        s = time.get(Calendar.SECOND);
        String teste = Integer.toString(h);
        String relogio = (h+":"+m+":"+s);
        this.hora = relogio;
        
        return hora;
    }
   

}
