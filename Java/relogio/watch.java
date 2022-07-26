package relogio;

import java.util.Scanner;

public class watch {
    public static void main(String[] args) {
        hours teste = new hours();
        teste.horas();
        while (true) {
            System.out.println("Relogio\n1-Alarme\n2-Sair");
            int resposta = new Scanner(System.in).nextInt();
            if (resposta == 1) {
                System.out.print("Hora:");
                String alarm = new Scanner(System.in).nextLine();
                teste.getAlarm(alarm);
                
                
            } else {
                break;
            }    
       }
       
       
        

       
       
        // hours thread2 = new hours( teste = 3);
       
    }
}
