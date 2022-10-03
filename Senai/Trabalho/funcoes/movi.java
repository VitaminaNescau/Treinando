package Senai.Trabalho.funcoes;

import java.util.Scanner;

import Senai.Trabalho.membros.f1;
import Senai.Trabalho.membros.family;

public class movi{
    family user;
    
    public void movimenta(){
        
        System.out.println("1 - Saques\n2 - Deposito");
        int t = new Scanner(System.in).nextInt();
        switch (t) {
            case 1://to chegando perto
                System.out.print("Saldo da conta:"+ user.vitor.getSaldo());
                break;
            case 2: 
                break;
        
            default:
                break;
        }
    }
    //public family
    
}
