package Senai.Trabalho.membros;

import java.util.Scanner;

public class f2 {
    private double saldo,nSaldo,dP;
    private String id;
    
    public String id(){
        id = "wesley";
        return id;
    }

    public double getSaldo(){
        saldo = nSaldo;
        return saldo;
    }
    public double saque(double s){
        if (s<=getSaldo()) {
             saldo = getSaldo()-s;
             nSaldo = saldo;
            return s;
        }else{
            System.out.println("Saldo insuficiente");
            return saldo;
       
        }
        
    }
    public double deposito(double d){
        dP = d;
        nSaldo = dP + saldo; 
        return dP;
    }

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
}
