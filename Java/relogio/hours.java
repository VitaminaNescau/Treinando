package Java.relogio;

import java.util.Calendar;

public class hours implements Runnable{
    public  String[] alarm = new String[5];
    private Calendar time;
    public int hr,mm,sc,h,n;
    public String hours;
    public hours(){
    
    }
    
    public void run(){
        hours clock = new hours();
        while (true) {
        try {System.out.println(clock.watch()); 
            Thread.sleep(5000);
            System.out.println(clock.hr+" "+alarm[1]+" "+hr);
            if (alarm[0] != null) {
                //clock.setAlarm(alarm[h],alarm[n]);
             System.out.println(clock.getAlarm());   
                } 
            }catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }    
    }
    public void stop(){

    }

    public String watch(){
        time = Calendar.getInstance();
        this.hr = time.get(Calendar.HOUR_OF_DAY);
        this.mm = time.get(Calendar.MINUTE);
        this.sc = time.get(Calendar.SECOND);
        this.hours = (hr+":"+mm);
        return hours;
    }
    public void setAlarm( String setHalarm,String setNalarm,int hP,int nP){
        //alarm = new String[5];
        this.h = hP;
        this.n = nP; 
        this.alarm[h] = "testando1";
        this.alarm[n] = "testando2";
       
        }
    
    public String getAlarm(){
    //for (int i = 0; i < alarm.length-1; i++) {   
        //hours clock = new hours();
        // System.out.println("teste: "+h+" "+n+" "+alarm[0]);
        if (alarm[0] == hours) {
             alarm[4] ="Alarme "+alarm[0]+" "+alarm[n]+" esta tocando ";         
            }
          else{
           alarm[4] = alarm[0]; 
           }
           return alarm[0];
        //}
        

    }


}

