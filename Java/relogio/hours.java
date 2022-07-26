package relogio;

import java.util.ArrayList;
import java.util.Calendar;

public class hours {
    //private String alarm;
    private Calendar time;
    public int hr,mm,sc;
    public String hours;
    private ArrayList <String> alarm = new ArrayList<>();
    public void horas(){
        hours hr = new hours();
        Thread hoursTh = new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                System.out.println(hr.watch());
               //hr.watch();
              
              
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            }     
        });
        Thread alarmTh = new Thread(new Runnable() {
            int i;
            @Override
            public void run(){
                while (true) {
                   // System.out.println(i+" "+ alarm.size());
                  for (String Alarm : alarm) {
                        i++;
                    if (Alarm.equals(hr.hours)) {
                        System.out.println("Alarme tocou");  
                    }
                    }
                try {

                    Thread.sleep(1000);
                } catch (Exception e) {
                   
                }  
            } 
            }
        });
        hoursTh.start();
        alarmTh.start();
    }
   
    public String watch(){
        time = Calendar.getInstance();
        hr = time.get(Calendar.HOUR_OF_DAY);
        mm = time.get(Calendar.MINUTE);
        sc = time.get(Calendar.SECOND);
        this.hours = (hr+":"+mm);
        return hours;
    }
    public void getAlarm( String setAlarm){
        String teste = setAlarm;
        alarm.add(teste);

        
    }





}

