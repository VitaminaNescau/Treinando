package Senai.atividades;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        System.out.println("Valor da compra: ");
        double c = new Scanner(System.in).nextDouble();
        //utilizei vetor para armazenamento das parcelas
        double p[] ={(c/1),(c/2),(c/3),(c/4),(c/5)};
       for (int i =0; i<p.length;i++) {
         System.out.println("Parcela "+(i+1)+"x: "+String.format("%.2f",p[i]));
       } 
       
    }
}
