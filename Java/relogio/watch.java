package Java.relogio;


public class watch {
    public static void main(String[] args) {
        hours thread = new hours();
        Thread t1 = new Thread(thread);
        t1.start();
       String getAlarm = "20:0:20";
        thread.getAlarm(getAlarm);
        // hours thread2 = new hours( teste = 3);
       
    }
}
