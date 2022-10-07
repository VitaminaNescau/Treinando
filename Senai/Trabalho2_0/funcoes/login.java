package Senai.Trabalho2_0.funcoes;

public class login extends account{
    private boolean login;
    private String user;
    public login(){
        acesso();
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
    


}
