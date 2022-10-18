package Senai.Trabalho2_0.funcoes.membros;

import java.util.Scanner;

import Senai.Trabalho2_0.funcoes.money2_0;

public class adm {
    boolean teste;
    String id;
    //money2_0 money = new money2_0();
    // inicia o caixa
    public String id(){
        id= "123456";
        return id;
    }
    public boolean iniciar(){
        
        return true;
    }
    // fecha o caixa
    public boolean fechar(){
        return false;
    }
    public void repoN(){
        System.out.println(money2_0.notas50+" Notas de 50 sacadas");
        System.out.println(money2_0.notas20+" Notas de 20 sacadas");
        System.out.println(money2_0.notas10+" Notas de 10 sacadas");
        System.out.println(money2_0.notas2+" Notas de 2 sacadas");
        System.out.println("Saque do dia efetuado: "+money2_0.rSaque);
        System.out.println("");
        System.out.println("Repor todas notas: 1 - SIM 2 - NÃO");
        int r = new Scanner(System.in).nextInt();
        switch (r) {
            case 1:
                money2_0.notas50 = 0;
                money2_0.notas10 = 0;
                money2_0.notas20 = 0;
                money2_0.notas2 = 0;
                money2_0.valorN = 0;
                System.out.println("Reposição feita com sucesso");
                break;
                case 2:

                break;
            default:
            System.out.println("Comando invalido");
                break;
        }
    }
    public boolean control(){
       
        
       
        System.out.println("1 - Iniciar caixar\n2 - Finalizar caixar\n3 - Repor notas");
        int r = new Scanner(System.in).nextInt();
        switch (r) {
            case 1:
              return iniciar();
            case 2:
               return fechar();
            case 3:
                repoN();
                return iniciar();
            default:
            System.out.println("Comando invalido");
                break;
        
    }
       // return teste;
        return teste = true;
       
    }
}
