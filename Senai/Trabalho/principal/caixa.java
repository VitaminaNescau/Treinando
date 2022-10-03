package Senai.Trabalho.principal;

import java.util.Scanner;

import Senai.Trabalho.funcoes.*;

public class caixa {
    static String login,password;
    
    public static void main(String[] args) {
        login l = new login();
        movi m = new movi();
        Scanner r = new Scanner(System.in);
        System.out.print("Login:"); 
        login = r.next();
        
        System.out.print("Passoword:");
        password = r.next();

        //verificar se existe a conta
        if (l.getLogin(login,password)) {
            System.out.println("Login efetuado");

            m.movimenta();
        }else{
            System.out.println("Login não efetuado");    
        } 

    r.close();   
    }
    
}
