package Senai.atividades;

import java.util.Scanner;

public class troca {
    public static void main(String[] args) {
        int a,b,r;
        System.out.print("De uma valor para variavel A: ");
        a = new Scanner(System.in).nextInt();
        System.out.print("De uma valor para variavel B: ");
        b = new Scanner(System.in).nextInt();
        r = a;
        a = b;
        b = r;
        System.out.println("A: "+a+" "+"B: "+b);

    }
}
