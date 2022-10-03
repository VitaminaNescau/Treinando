package Senai.Trabalho.funcoes;

import java.util.Scanner;

import Senai.Trabalho.membros.f1;

public class movi{
    f1 vitor;
    
    public void movimenta(){
        
        System.out.println("1 - Saques\n2 - Deposito");
        int t = new Scanner(System.in).nextInt();
        switch (t) {
            case 1:
                System.out.print("Saldo da conta:");
                break;
            case 2: 
                break;
        
            default:
                break;
        }
    }
    //public family
    
}
