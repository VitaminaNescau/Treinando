package Senai.atividades;

import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String n = resposta.nextLine();
        System.out.print("Nota 1: ");
        double n1 = resposta.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = resposta.nextDouble();    
        System.out.print("Nota 3: ");
        double n3 = resposta.nextDouble();
        double m = (n1+n2+n3)/3;
        System.out.println("Nome do aluno: "+n+"\nMédia: "+(String.format("%.2f",m)));
        //String.format para limitar em 2 casas decimais
    }
}
