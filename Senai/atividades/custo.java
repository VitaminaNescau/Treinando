package Senai.atividades;

import java.util.Scanner;

public class custo {
    public static void main(String[] args) {
        System.out.print("Custo do produto: ");
        double c = new Scanner(System.in).nextDouble();
        System.out.print("Porcentagem de ganho: ");
        double p = new Scanner(System.in).nextDouble();
        p = p/100;
        double v = c+(c*p);
        System.out.println("Venda : "+v);
    }
    }
