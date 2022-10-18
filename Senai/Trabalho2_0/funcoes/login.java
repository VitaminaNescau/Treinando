package Senai.Trabalho2_0.funcoes;

import Senai.Trabalho2_0.funcoes.membros.adm;
import Senai.Trabalho2_0.funcoes.membros.davi;
import Senai.Trabalho2_0.funcoes.membros.douglas;
import Senai.Trabalho2_0.funcoes.membros.gisela;
import Senai.Trabalho2_0.funcoes.membros.pedro;
import Senai.Trabalho2_0.funcoes.membros.vitor;

public class login extends account{
    private boolean login;
    private String user;
    vitor v = new vitor();
    douglas d = new douglas();
    davi da = new davi();
    gisela g = new gisela();
    pedro p = new pedro();
    adm ad = new adm();
    
    
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
            d.movi();
        }
        if (contas.get(2).equals(user)) {
            da.movi();
        }
        if (contas.get(3).equals(user)) {
            g.movi();
        }
        if (contas.get(4).equals(user)) {
            p.movi();
        }
       /*  if (contas.get(5).equals(user)) {
            ad.control();
        }*/
       
    }
    
 

}
