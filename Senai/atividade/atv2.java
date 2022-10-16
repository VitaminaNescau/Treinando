package Senai.atividade;

import java.util.Scanner;

/**
 * atv2
 */
public class atv2 {
    static int idade;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma idade:");
        int i1 = sc.nextInt(); 
        System.out.print("Digite uma idade:");
        int i2 = sc.nextInt(); 
        System.out.print("Digite uma idade:");
        int i3 = sc.nextInt(); 
        System.out.print("Digite uma idade:");
        int i4 = sc.nextInt();
        System.out.print("Digite uma idade:");
        int i5 = sc.nextInt();
        System.out.println(getIdadeMax(i1, i2, i3, i4, i5));
        
    }
    public static int getIdadeMax(int n1,int n2, int n3, int n4, int n5){
         int i = 1;
         int t=0,
         aux=n1;
        while (i<=5) {
            if (idade<aux) {
                idade = aux ;
            } else {
                return idade;
            }
            i++;
         }
         return idade;
    }
    
}