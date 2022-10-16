package Senai.atividade;
import java.util.Scanner;
public class atv3 {
	static int voto=0,l=0,c=0,b=0,n=0;
	public static void main(String[] args) {
		while(true) {
		System.out.println("Eleição");
		System.out.println("Presidente\n1-Lula\n2-Ciro\n3-Bosolnario\n0-Encerrar\nQualquer outra resposta é igual a nulo");
		int p = new Scanner(System.in).nextInt();
		setVoto(p);
		
		if (p==0) {
			break;
		}
		}
		/*if (l==c || l==b) {
			secondT();
		}*/
		if(voto!=0) {
		result();
		}
	}
	public static void setVoto(int v) {
		voto++;
		switch (v) {
		case 1:
			l++;
			break;
		case 2:
			c++;
			break;
		case 3: 
			b++;
			break;

		default:
			n++;
			break;
		}
			
		}
	public static String getVotoMax() {
		String max = null;
		if (l>c && l>b) {
			max = "Lula";
		} else if(c>l && c>b) {
			max = "Ciro";
		}
		else {
			max="Bosolnaro";
		}
		return max;
		}
	public static void result() {
		if((voto/n)<(voto/c) && (voto/n)<(voto/b) && (voto/n)<(voto/l)) {
			System.out.println("Nova eleições seram feitas pos maioria voto nulo");
			
		}
		if((voto/l)<(voto/c) && (voto/l)<(voto/b)) {
			System.out.println("Lula ganhou");
			
		}
		if((voto/c)<(voto/l) && (voto/c)<(voto/b)) {
			System.out.println("Ciro ganhou");
			
		}
		if((voto/b)<(voto/l) && (voto/b)<(voto/c)) {
			System.out.println("Bosolnario ganhou");
		
		}}
	
public static void secondT() {
	System.out.println("Segundo turno");
	
}
}


