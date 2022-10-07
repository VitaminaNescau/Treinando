package Senai.Trabalho2_0.main;

import java.util.Scanner;
import Senai.Trabalho2_0.funcoes.*;

public class caixa{
  
    public static void main(String[] args) {
          login l = new login();
        System.out.print("Caixa\nLogin:");
        String log = new Scanner(System.in).next();
        if (l.getLogin(log)) {
            
        } else {
            System.out.println("não passou");
        }
        
    }
}
