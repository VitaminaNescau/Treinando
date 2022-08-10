package Senai.atividades;

import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        System.out.println("Digite o raio do circulo em metros: ");
        double r = new Scanner(System.in).nextDouble();
        double c = Math.PI*(r*r);
        System.out.println("A área do circulo: "+String.format("%.2f", c)+"m");
    }
}
