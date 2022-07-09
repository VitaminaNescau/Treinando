package Java.relogio;

import java.util.Calendar;

public class hours implements Runnable{
    private String[] alarm = new String[5];
    private Calendar time;
    public int hr,mm,sc,h,n;
    public String hours;
    public hours(){
    }
    public void run(){
        hours clock = new hours();
        while (true) {
        try { clock.watch(); 
                Thread.sleep(1000);
                if (alarm != null) {
                    //clock.setAlarm(alarm[h],alarm[n]);
                    clock.getAlarm();
                }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
          
        }
        
    }
    public String watch(){
        time = Calendar.getInstance();
        hr = time.get(Calendar.HOUR_OF_DAY);
        mm = time.get(Calendar.MINUTE);
        sc = time.get(Calendar.SECOND);
        this.hours = (hr+":"+mm+":"+sc);
        return hours;
    }
    public void setAlarm( String setHalarm,String setNalarm,int hP,int nP){
        //alarm = new String[5];
        this.h = hP;
        this.n = nP;
        this.alarm[h] = setHalarm;
        this.alarm[n] = setNalarm;
        System.out.println(alarm[h]+"  "+alarm[n]+" "+h+" "+n);
        }
    
    public String getAlarm(){
        for (int i = 0; i < alarm.length-1; i++) {  
           if (alarm[i].equals(hours)) {
                alarm[5]=("Alarme "+alarm[0]+" "+alarm[0+1]+" esta tocando");
           
            }
        }
        return alarm[5];
        

    }


}

