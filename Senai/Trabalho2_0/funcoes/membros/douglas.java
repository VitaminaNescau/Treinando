package Senai.Trabalho2_0.funcoes.membros;

import java.util.Scanner;

import Senai.Trabalho2_0.funcoes.money;

public class douglas {
    double saldo,nSaldo,saque;
    String id;
    money m = new money();
    public String getId(){
       id = "Douglas";
        return id;
    }
    public double getSaldo(){
        //saldo = nSaldo + saldo;
        return saldo;
    }
    public double deposito(double d){
        nSaldo = d;
        saldo = saldo + nSaldo;
        System.out.println("Deposito de "+nSaldo+" feito com sucesso");
        return nSaldo;
    }
    public double saque(double s){
        if (s<=saldo && s>0 && s<=328)  {
            saque = s;
            saldo = saldo - saque;
            System.out.println("Organizando notas");
            m.contaM(saque);
            System.out.println("Saque de "+ s +"efetuado");
        } else {
            System.out.println("Saque negado");
        }
        return saque;
    } 
  
    public void movi(){
       boolean repet = true;
        while (repet) { 
        double sV,dV;
        System.out.println("Bem vindo "+getId()+"\n1 - Saque\n2 - Deposito\n3 - Saldo\n4 - Logout");
        int r = new Scanner(System.in).nextInt();
        switch (r) {
            case 1:
                
                System.out.print("Digite o valor do saque: ");
                saque(sV = new Scanner(System.in).nextDouble());
                //não sabia q podia fazer isso 
            break;
            case 2:
                System.out.print("Digite o valor de deposito: ");
                deposito(dV = new Scanner(System.in).nextDouble());

            break;
            
            case 3:
                System.out.println("Saldo: "+getSaldo());
                break;
            case 4:
                repet = false;
                break;
            default:
                break;
        }
    }
    }
}
