package Senai.atividades;

import java.util.Scanner;

public class converco {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        System.out.println("Dolar hoje: ");
        double dH = resposta.nextDouble();
        System.out.println("Dolar na carteira: ");
        double dC = resposta.nextDouble();
        dC = dC*dH;
        System.out.println(String.format("%.2f", dC));
    }
}
