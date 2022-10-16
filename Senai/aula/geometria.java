package Senai.aula;

import java.util.Scanner;

import Senai.geometry.cal_C;

public class geometria {

	public static void main(String[] args) {
		cal_C C = new cal_C();
		System.out.println("Qual geometria quer calcular:\n1-Circulo\n2-Quadrado\n3-Triangulo");
		int r = new Scanner(System.in).nextInt();
		switch (r) {
		case 1:
			System.out.print("Qual o raio do circulo:");
			double raio= new Scanner(System.in).nextDouble();
			System.out.println(C.getC(raio));
			System.out.println(C.getCp(raio));
			
			break;
		case 2:
			System.out.print("Digite a base do quadrado:");
			double baseR = new Scanner(System.in).nextDouble();
			System.out.print("Digite a altura do quadrado:");
			double alturaR = new Scanner(System.in).nextDouble();
			System.out.println(C.getR(baseR, alturaR));
			System.out.println(C.getRp(baseR, alturaR));
			break;
		case 3:
			System.out.print("Digite a base do quadrado:");
			double baseT = new Scanner(System.in).nextDouble();
			System.out.print("Digite a altura do quadrado:");
			double alturaT = new Scanner(System.in).nextDouble();
			System.out.println(C.getT(baseT, alturaT));
			System.out.println(C.getTp(baseT, alturaT));

			break;

		default:
			System.out.println("Digitou errado");
			break;
		}
		
		
		

	}

}
