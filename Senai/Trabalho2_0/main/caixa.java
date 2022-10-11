package Senai.Trabalho2_0.main;

import java.util.Scanner;
import Senai.Trabalho2_0.funcoes.*;
import Senai.Trabalho2_0.funcoes.membros.*;

public class caixa{
  
    public static void main(String[] args) {
        login l = new login();
        adm teste = new adm();
         boolean repet = teste.control();
        while (repet) {
        System.out.print("Caixa\nLogin:");
        String log = new Scanner(System.in).next();
        if (l.getLogin(log)) {
            System.out.println("Passou");
           l.setUser();
        } else {
            System.out.println("não passou");

    }
   
    


    }
}
}
