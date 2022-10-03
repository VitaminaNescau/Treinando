package Senai.Trabalho.principal;

import Senai.Trabalho.membros.f1;
import Senai.Trabalho.membros.family;

public class login extends account{
    private String user;
    private String idL;
   
    private boolean status = false;
    public login(){
        teste();// usando o contrutor para inicializar as contas  
    }

    /*public boolean setLogin(String u,String p){
        
        status = getlogin(u);
        return status;
    }*/
    //teste de login caso der false ele ira verificar até chegar o tamanho do array
    public boolean getLogin(String u,String p){
              
        this.user = u;
        System.out.println(login_p.size());
        for (int i = 0; i < login_p.size(); i++) {
           
            if (login_p.get(i).equals(user)) {
                status= true;
                System.out.println(status);
                break;
                //o break sera acionado para não ser necessario pecorrer todo o array
                
            }else{
                status= false;
            }
        } 
        return status;

      }

}
