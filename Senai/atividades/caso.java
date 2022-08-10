package Senai.atividades;

import java.util.Scanner;

public class caso {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        int n = new Scanner(System.in).nextInt();
        if (n>20) {
            System.out.println(n);
        } else if(n==20) {
            System.out.println("Numero igual a 20");
        }else{
            System.out.println("Numero menor que 20");
        }
    }
}
