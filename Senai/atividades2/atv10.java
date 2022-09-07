package Senai.atividades2;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
       int c,c4=0,c5=0;
       
        while (true) {
            System.out.println("Digite o canal:");
            c = new Scanner(System.in).nextInt();
            switch (c) {
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                default:
                if (c4>c5) {
                    System.out.println("Canal 4 foi o mais assitido");
                         } else {
                         System.out.println("Canal 5 foi o mais assitido");
    }
                    break;
            }      
        }
        
    }
}
