package Senai.Trabalho2_0.funcoes;

public class money2_0 {
    double valor, valor2, valorN;
    int  notas50 , notas20, notas10, notas2;
    public static void main(String[] args) {
        money2_0 m = new money2_0();
       // System.out.println(m.contagem(150));
       //while (true) {
        if (m.contagem(10).equals("Sem saldo no caixa")){
           // break;
           System.out.println("n");
        }else{
            System.out.println(m.contagem(1650));
            
        }
        
       //} 
       
    }
    public String contagem(double v){
       valor = v;// valor do saque
       valorN = v;// esse valor é pra verificar o saldo do caixa
       if (valorN >= 1640) {
            return "Sem saldo no caixa";//caso o saldo do saque seja maior q o saldo atual
       }
        if(valor2 < valor){
            while (valor2 < valor) {
                if (notas50<= 20) {
                    valor2 += 50;
                    notas50++;
                    valorN = valorN+ 50;
                   // System.out.println(notas50);
                }else{
                    System.out.println("passou de 20 notas de 50");
                   // System.out.println(notas50);
                    break;
                }
            } if (valor2 > valor) {
                valor2 -= 50;
                notas50--;
                valorN = valorN - 50;
            
            }
        }
        if (valor2 < valor) {
            while (valor2 < valor) {
                if (notas20<=20) {
                     valor2 += 20;
                    notas20++;
                    valorN = valorN + 20;
                } else {
                    System.out.println("passou de 20 notas de 20");
                    // System.out.println(notas20);
                     break;
                }
               
            } if  (valor2 > valor){
                valor2 -=20;
                notas20 -= 1;
                valorN = valorN - 20;
            }
        }if(valor2 < valor){
            while (valor2 < valor){
                if (notas10<=20) {
                     valor2 += 10;
                    notas10++; 
                    valorN = valorN +10;
                }else{
                    System.out.println("passou de 20 notas de 10");
                    // System.out.println(notas10);
                     break;
                }
                }
               //variavel com a quatidade de notas
               if  (valor2 > valor){
                valor2 -=10;
                notas10 -= 1;
                valorN = notas10 - 10;
            }
            }
            if(valor2 < valor){
                while (valor2 < valor){
                    if (notas2 <= 20) {
                        valor2 += 2;
                    notas2++;
                    valorN = valorN + 2;
                    }else{
                        System.out.println("passou de 20 notas de 2");
                    // System.out.println(notas2);
                     break;
                    }
                     //variavel com a quatidade de notas
                }
                if  (valor2 > valor){
                    valor2 -=2;
                    notas2 -= 1;
                    valorN = valorN - 2;
                }
            }
            

        
    
        
        return notas50+" notas de 50\n"+notas20+" notas de 20\n"+notas10+" notas de 10\n"+ notas2+" notas de 2";
    }
   
}

