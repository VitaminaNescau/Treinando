package Senai.geometry;

public class cal_C {
	public double area,perimetro;
	final double pi = 3.14;
	public double raio;
	public double base;
	public double altura;
	
	public double getC(double r) {
	raio = r;
	area = pi *(raio*raio);
	
	return area;
	}
	public double getCp(double r) {
		double c = 2* pi* r;
		return perimetro;
	}
	public double getR(double b,double a) {
		base = b;
		altura = a;
		area = base * altura;
		return area;
		
	}
	public double getRp(double b ,double a) {
		perimetro = (b*2)+(a*2);
		return perimetro;
	}
	
	public double getT(double b,double a) {
		// sem atribuir os parametros a uma variavel 
		area = (b*a)/2;
		return area;
	}
	public double getTp(double b,double a) {
		double area = getT(b, a);
		perimetro = Math.sqrt(area)*3;
		return perimetro;
	}

}
