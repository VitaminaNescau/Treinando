package relogio;

import java.util.Scanner;

public class watch {
    public static void main(String[] args) {
        hours watch = new hours();
        watch.horas();
        while (true) {
            System.out.println("Relogio\n1-Alarme\n2-Sair");
            int resposta = new Scanner(System.in).nextInt();
            if (resposta == 1) {
                System.out.print("Hora:");
                String alarm = new Scanner(System.in).nextLine();
                watch.getAlarm(alarm);  
            } else if(resposta == 2) {
                break;
            }  else{
                System.out.println("Comando Invalido");
            }
       }
       
       
        

       
       
        // hours thread2 = new hours( teste = 3);
       
    }
}
