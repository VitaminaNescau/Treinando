package Senai.Trabalho2_0.funcoes;

import Senai.Trabalho2_0.funcoes.membros.vitor;

public class login extends account{
    private boolean login;
    private String user;
    vitor v = new vitor();
    
    
    
    public login(){
        acesso();
        // metodo construtor sem parametro, então ira iniciar quando a classe ser instanciada 
    }

    public boolean getLogin(String l){
       for (int i = 0; i < contas.size(); i++) {
        if (contas.get(i).equals(l)) {
            login = true;
            user = contas.get(i);
            break;
        } else {
            login = false;
        }
       }
    return login;
    
        
    }
    public void setUser(){
        if (contas.get(0).equals(user)) {
            v.movi();
        }
        if (contas.get(1).equals(user)) {
            
        }
        if (contas.get(2).equals(user)) {
            
        }
        if (contas.get(3).equals(user)) {
            
        }
        if (contas.get(4).equals(user)) {
            
        }
    }
    


}
