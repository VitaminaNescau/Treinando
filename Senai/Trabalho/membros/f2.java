package Senai.Trabalho.membros;

public class f2 {
    private double saldo,nSaldo=1500;
    private String id;
    
    public String id(){
        id = "welsey";
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
}
