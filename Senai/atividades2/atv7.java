package Senai.atividades2;

import java.util.Scanner;



public class atv7 {
    public static void main(String[] args) {
        double media= 0;
         Scanner r = new Scanner(System.in);    
         int i = 0 ;
        while (i <= 3) {
            
         
         System.out.print("Nome: ");
        String nome = r.next();
        System.out.print("Nota 1: ");
        double n1 = r.nextDouble();
        System.out.println("Nota 2: ");
        double n2 = r.nextDouble();
        double m = (n2+n1)/2;
        media = m+media;
        i++;
         }
        System.out.println(String.format("%.2f", (media/15)) ); 
    }
}
