package Senai.atividades2;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int b=0,v=0,c=0,f=0,o=0,l=0,s=0,t=0;
        double aux=0;
       while (true) {
        System.out.println("Qual é seu time favorito:\n1-Bahia\n2-Vitória\n3-Corinthians\n4-Flamengo\n5-Outros");
        int time = r.nextInt();
        switch (time) {
            case 1:
                b++;
                break;
            case 2:
                v++;
            break;
            case 3:
                c++;
            break;
            case 4:
                f++;
            break;
            case 5:
                o++;
            break;
            default:
                break;

        }
        if (time==0) {
            break;
        }
        System.out.print("Onde você mora:\n1-Salvador\n2-Lauro de freitas\n3-Outros");
        int cid = r.nextInt();
        if (cid == 2) {
                l++;
            }
        if(cid == 1 && time == 2) {
            t++;
        }
        System.out.print("Qual o seu salário: ");
        double sal = r.nextDouble();
        if (time == 1) {
            aux= sal+aux;
            
        }
       System.out.println("Encerrar pesquisa(1-sim/2-não): ");
       int e = r.nextInt();
       if (e==1) {
        System.out.println(l+" "+aux+""+t);
        break;
       }
        
    }
}
}
