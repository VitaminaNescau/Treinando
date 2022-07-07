package Java.relogio;

import java.util.Calendar;

public class hours implements Runnable{
    private int alarm;
    private Calendar time;
    public int hr,mm,sc;
    public String hours;
    public hours(int wake){
        this.alarm = wake;
    }
    public hours(){

    }
    public void run(){
        hours teste = new hours();
        while (true) {
        try {  System.out.println(teste.watch());
        
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }

    public String watch(){
        time = Calendar.getInstance();
        hr = time.get(Calendar.HOUR_OF_DAY);
        mm = time.get(Calendar.MINUTE);
        sc = time.get(Calendar.SECOND);
        this.hours = (hr+":"+mm);
        return hours;
    }

    public void getAlarm(){
        if (alarm == Integer.parseInt(hours)) {
            System.out.println("tocou");
        }
        //return alarm;
    }





}

