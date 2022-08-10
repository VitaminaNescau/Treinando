package Senai.atividades;

import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        System.out.print("Digite a distancia total percorrida: ");
        double d = resposta.nextDouble();
        System.out.print("Digite o total de combustivel gasto: ");
        double c = resposta.nextDouble();
        System.out.println("O consumo médio do automóvel é: "+(d/c));
    }
}
