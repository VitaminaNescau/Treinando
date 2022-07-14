package Java.relogio;

import java.util.Scanner;

public class watch {
    public static void main(String[] args) {
        hours thread = new hours();

        Thread t1 = new Thread(thread);
        t1.start();
        while (true) {
            System.out.println("Relogio\n1-Alarme\n2-Sair");
            int resposta = new Scanner(System.in).nextInt();
            if (resposta == 1) {
                System.out.print("Hora do alarme:");
                String hAlarm = new Scanner(System.in).next();
                System.out.print("Nome do alarme:");
                String nAlarm = new Scanner(System.in).next();
                thread.setAlarm(hAlarm,nAlarm,0,1); 
               
                
            } else {
                t1.stop();
                break;
            }    
       }
       
       
        

       
       
        // hours thread2 = new hours( teste = 3);
       
    }
}

