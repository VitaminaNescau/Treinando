package Senai.atividades2;

import java.util.Scanner;

import javax.swing.text.TabExpander;

public class atv9 {
    public static void main(String[] args) {
        double rP,rF,tA,tD;
        int a = 0;
        Scanner r = new Scanner(System.in);
        while (true) {
            System.out.print("Renda pessoal: ");
            rP = r.nextDouble();
            System.out.print("Renda familiar: ");
            rF = r.nextDouble();
            System.out.print("Total gasto com alimentos: ");
            tA = r.nextDouble();
            System.out.print("Total gasto com despesas: ");
            tD = r.nextDouble();
            if(rP >200 | rF>200 | tA>200 | tD>200){
                a++;

            }
        }

    }
}
