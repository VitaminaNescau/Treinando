package Java.relogio;

import java.util.Calendar;

public class horas {
    public int h,m,s;
    public String hora,relogio;
    public Calendar time;
    
    public horas(){
    
    }
    
    
    public String setTime(){
        time = Calendar.getInstance();
        h = time.get(Calendar.HOUR_OF_DAY);
        m = time.get(Calendar.MINUTE);
        s = time.get(Calendar.SECOND);
        relogio = (h+":"+m+":"+s);
        this.hora = relogio;
        return hora;
    }
    public void getTime(){
        horas clock = new horas();
        while (true) {
            try { System.out.println(clock.setTime());
                Thread.sleep(1000);
               } catch (InterruptedException e) {
                //TODO Auto-generated catch block
        
                e.printStackTrace();
        }
        
            }
    //return hora;
   }

}
