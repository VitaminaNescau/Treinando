package Senai.atividades;

import java.util.Scanner;
import java.util.Locale.Category;

import relogio.function.locale;

import java.util.Locale;
public class operacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //utiliza . em vez de ,
        Scanner resposta = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = resposta.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = resposta.nextDouble();
        System.out.println("Resultado da soma dos numeros é "+(n1+n2));
        System.out.println("Resultado da subtração dos numeros é "+(n1-n2));
        System.out.println("Resultado da multiplicação dos numeros é "+(n1*n2));
        System.out.println("Resultado da divisão dos numeros é "+(n1/n2));
    }
}
