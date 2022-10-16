package Senai.Trabalho.funcoes;

import java.util.Scanner;

import Senai.Trabalho.membros.*;

import Senai.Trabalho.principal.account;

public class movi extends account{
    f1 f1;
    f2 f2;
    
    public void movimenta(){
        teste();
      for (int i = 0; i <= login_p.size(); i++) {
        
        System.out.println("chegou aq");
        //System.out.println(f1.id());
        
        if (login_p.get(i).equals(f1.id())) {
            f1.movimenta();
            break;
        }
        if (login_p.get(i).equals(f2.id())) {
            f2.movimenta();
            break;
        }  
      }
    //public family
    
}
}
