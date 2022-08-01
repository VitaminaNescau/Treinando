package API;

import java.util.Scanner;

public class apiCEP {
public static void main(String[] args) throws Exception {
    System.out.println("Informe seu CEP: ");
    String teste = new Scanner(System.in).nextLine();
    endereco E = cep.BEP(teste);
        System.out.println("Logradouro: " + E.getLogradouro());
        System.out.println("Bairro: " + E.getBairro());
        System.out.println("Localidade: " + E.getLocalidade());
}
    
}