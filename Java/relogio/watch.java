package Java.relogio;

import java.util.Scanner;

public class watch {
    public static void main(String[] args) {
        hours thread = new hours();
        Thread t1 = new Thread(thread);
        t1.start();
        String getAlarm = null;
        //String resposta = null;
        while (true) {
            System.out.println("Relogio\n1-Alarme\n2-Sair");
            int resposta = new Scanner(System.in).nextInt();
            if (resposta == 1) {
                System.out.print("Hora:");
                String teste;
                getAlarm = teste = new Scanner(System.in).next();
                thread.getAlarm(getAlarm); 
                
            } else {
                break;
            }    
       }
       
       
        

       
       
        // hours thread2 = new hours( teste = 3);
       
    }
}
