package Senai.atividades;

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        System.out.println("Digite a temperaturam em graus Celsius: ");
        double c = new Scanner(System.in).nextDouble();
        double f = (9*c+160) / 5;
        System.out.println("A temperatura em Fahrenheit: "+(String.format("%.2f", f)));
    }
    
}