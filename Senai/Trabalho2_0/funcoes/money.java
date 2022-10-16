package Senai.Trabalho2_0.funcoes;



public class money {
    double valor, valor2, notas50 , notas20, notas10, notas2;
    
    public void contaM(double v) {
        
        //valor do saque
        valor = v;
        
            
        
        //notas de 50
        if(valor2 < valor){
            
            while (valor2 < valor){
                if (notas50 <= 20) {
                    valor2 += 50;
                notas50++;
                System.out.println(notas50);
            }else{
                 //variavel com a quatidade de notas
                System.out.println("passou de 20 notas ");
                }
            }
            if  (valor2 > valor){
                valor2 -=50;
                notas50 -= 1;
            }
            System.out.println(notas50 + " notas de 50");
        }
        //notas de 20
        if(valor2 < valor){
            while (valor2 < valor){
                valor2 += 20;
                notas20++; //variavel com a quatidade de notas
            }
            if  (valor2 > valor){
                valor2 -=20;
                notas20 -= 1;
            }
            System.out.println(notas20 + " notas de 20");
        }
        //notas de 10
        if(valor2 < valor){
            while (valor2 < valor){
                valor2 += 10;
                notas10++; //variavel com a quatidade de notas
            }
            if  (valor2 > valor){
                valor2 -=10;
                notas10 -= 1;
            }
            System.out.println(notas10 + " notas de 10");
        }
        //notas de 2
        if(valor2 < valor){
            while (valor2 < valor){
                valor2 += 2;
                notas2++; //variavel com a quatidade de notas
            }
            if  (valor2 > valor){
                valor2 -=2;
                notas2 -= 1;
            }
            System.out.println(notas2 + " notas de 2");
        }
    
    }
    
}
