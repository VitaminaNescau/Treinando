package Senai.atividades;

import java.util.Scanner;

public class decrescente {
    public static void main(String[] args) {
            Scanner resposta = new Scanner(System.in);
            boolean r= true;
            while (r) {
            System.out.print("Digite um numero:");
            int n1 = resposta.nextInt();
            System.out.print("Digite outro numero:");
            int n2 = resposta.nextInt();
            if (n1==n2) {
                System.out.println("Numeros iguais, digite outro numero.");
                
            } else {
                if (n1>n2) {
                    System.out.println(n1+"\n"+n2);
                    r = false;
                } else {
                    System.out.println(n2+"\n"+n1);
                    r = false;
                }
            }
        }
            
        }
    
}