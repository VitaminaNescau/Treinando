package relogio;

import java.util.ArrayList;
import java.util.Calendar;

public class hours {
    //private String alarm;
    private Calendar time;
    public int hr,mm,sc;
    public String hours;
    private ArrayList <String> alarm = new ArrayList<>();
    private boolean alarmOnOf;
   
    public void horas(){
        hours hr = new hours();
        
        //essa thread mostrara a hora a cada 1 minuto
        Thread hoursTh = new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                hr.watch();
               //hr.watch();
               if (alarm.size()>0) {
                    alarmOnOf = true;
                }else{
                    alarmOnOf = false;
                }  
              
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            }     
        });
        //essa thread verifica se tem algum alarm e compara com a hora atual para ser acionado 
        Thread alarmTh = new Thread(new Runnable() {    
            @Override
            public void run(){
                while (true) {
                    if (alarmOnOf) {                                  
                    for (int i = 0; i < alarm.size(); i++) {
                      // System.out.println(alarm.size()+" "+alarm.get(i));
                        if (alarm.get(i).equals(hr.hours)) {
                        System.out.println("Alarme tocou");  
                        alarm.remove(i);
                    }
                    }
                }
                try {

                    Thread.sleep(30000);
                } catch (Exception e) {
                   
                }  
            } 
            }
        });
        hoursTh.start();
        alarmTh.start();
    }
    // esse metodo recebera os dados da hora
    public String watch(){
        time = Calendar.getInstance();
        hr = time.get(Calendar.HOUR_OF_DAY);
        mm = time.get(Calendar.MINUTE);
        sc = time.get(Calendar.SECOND);
        this.hours = (hr+":"+mm);
        return hours;
    }
    //esse metodo recebera os possiveis alarmes
    public void getAlarm( String setAlarm){
        String getAlarm = setAlarm;
        alarm.add(getAlarm);    
    }





}

