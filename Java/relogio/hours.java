package Java.relogio;

import java.util.Calendar;

public class hours implements Runnable{
    private String alarm;
    private Calendar time;
    public int hr,mm,sc;
    public String hours;
    /* public hours(int wake){
        this.alarm = wake;    
    } */
    public hours(){
    }
    public void run(){
        hours clock = new hours();
        while (true) {
        try {  System.out.println(clock.watch());
                Thread.sleep(1000);
                clock.getAlarm(alarm);
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

    public void getAlarm( String setAlarm){
        this.alarm = setAlarm;
        //System.out.println(alarm +"  "+hr);
        if (alarm.equals(hours)) {
            System.out.println("tocou");
        }
       
    }





}

