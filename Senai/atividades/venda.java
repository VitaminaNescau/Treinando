package Senai.atividades;

import java.util.Locale;
import java.util.Scanner;

public class venda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner resposta = new Scanner(System.in);
        System.out.print("Nome: ");
        String n = resposta.nextLine();
        System.out.print("Salario: ");
        double s = resposta.nextDouble();
        System.out.print("Total de vendas: ");
        double v = resposta.nextDouble();
        double p = 0.15;//15%
        double sF= s+(v*p);
        System.out.println("Nome: "+n+"\nSalário fixo: "+s+"\nSalário final: "+sF);

    }
}
