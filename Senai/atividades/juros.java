package Senai.atividades;

import java.util.Scanner;

public class juros {
    public static void main(String[] args) {
        System.out.println("Valor de depoisto: ");
        double d = new Scanner(System.in).nextDouble();
        double j = 0.007;//0,70%, juros fixo
        double jM = d*j;
        System.out.println("Rendimento: "+(d+jM));
    }
}
