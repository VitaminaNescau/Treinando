package Senai.Trabalho2_0.funcoes.membros;

import java.util.Scanner;

public class adm {
    boolean teste;
    // inicia o caixa
    public boolean iniciar(){
        
        return true;
    }
    // fecha o caixa
    public boolean fechar(){
        return false;
    }
    public boolean control(){
        System.out.println("1 - Iniciar caixar\n2 - Finalizar caixar");
        int r = new Scanner(System.in).nextInt();
        switch (r) {
            case 1:
              teste = iniciar();
                break;
            case 2:
                teste = fechar();
                break;
            default:
                break;
        }
        return teste;
       
    }
}
