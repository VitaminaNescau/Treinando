package Senai.atividades;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = resposta.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = resposta.nextDouble();
        System.out.println("Resultado da soma dos numeros é "+(n1+n2));
        }
}
