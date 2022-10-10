package Senai.Trabalho2_0.funcoes.membros;

import java.util.Scanner;

public class vitor {
    double saldo,nSaldo,saque;

    public double getSaldo(){
        saldo = nSaldo + saldo;
        return saldo;
    }
    public double deposito(double d){
        nSaldo = d;
        return nSaldo;
    }
    public double saque(double s){
        if (s<saldo) {
            System.out.println("Saque efetuado");
        } else {
            System.out.println("Saque negado");
        }
        return saque;
    } 
  
    public void movi(){
        System.out.println("1 - Saque\n2 - Deposito\n3 - Saldo");
        int r = new Scanner(System.in).nextInt();
        switch (r) {
            case 1:
                double sV;
                System.out.print("Digite o valor do saque:");
                saque(sV = new Scanner(System.in).nextDouble());
                //não sabia q podia fazer isso 
            break;
            case 2:
            
            break;
            
            case 3:
                System.out.println("Saldo: "+getSaldo());
                break;
        
            default:
                break;
        }
    }
}
