package Senai.atividades;

import java.util.Scanner;

public class menor {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int n1 = resposta.nextInt();
        System.out.println("Digite outro numero");
        int n2 = resposta.nextInt();
        if (n1>n2) {
            System.out.println(n2);
        } else {
           System.out.println(n1); 
        }
    }
}
