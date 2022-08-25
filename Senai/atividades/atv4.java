package senai_atv;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		for (int i = 0; i <=20;i++) {
			System.out.print("Nome: ");
			String nome = r.next();
			System.out.println("Sexo: ");
			String sexo = r.next();
			System.out.print("Idade: ");
			int idade = r.nextInt();
			if(idade > 20 && sexo.equals("M") || sexo.equals("m")) {
				System.err.println("teste");
				System.out.println(nome);
			}
		}
		r.close();
		

	}

}
