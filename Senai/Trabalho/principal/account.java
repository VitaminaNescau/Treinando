package Senai.Trabalho.principal;

import java.util.ArrayList;

/**
 * account
 */
public class account  {
    protected ArrayList <String> login_p = new ArrayList<>();
    
    /*  boolean getlogin(String u){
      teste();
        if (login_p.get(0).equals(u)) {
         return true;
      }else{
        return false;
      }
    }*/
    public void teste(){
        login_p.add("vitor");//vitor.classe
        login_p.add("wesley");//wesley.classe
        login_p.add("1235");
      }
}