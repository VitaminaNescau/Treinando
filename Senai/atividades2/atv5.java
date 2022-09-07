package Senai.atividades2;

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        int aux = 0;
        Scanner r = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = r.nextInt();
        System.out.print("Outro numero:");
        int n2 = r.nextInt();
        if (n1>n2) {
            while(n2>0){
                n2--;
                aux = n1+aux;
            }
        } else {
            while(n1>0){
                n1--;
                aux = n2+aux;
            }
        }   System.out.println(aux);
    }
}
