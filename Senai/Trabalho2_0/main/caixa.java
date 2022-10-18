package Senai.Trabalho2_0.main;

import java.util.Scanner;
import Senai.Trabalho2_0.funcoes.*;
import Senai.Trabalho2_0.funcoes.membros.*;

public class caixa{
  
    public static void main(String[] args) {
        login l = new login();
        adm ad = new adm();
         boolean repet = ad.control();
        while (repet) {
        System.out.print("Caixa\nLogin:");
        String log = new Scanner(System.in).next();
        if (l.getLogin(log)) {
            System.out.println("");
             l.setUser();
        } else if (log.equals(ad.id())){
            repet = ad.control();
        }else {
            System.out.println("não passou");

    } 
    }
}
}
