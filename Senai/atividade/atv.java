package Senai.atividade;

public class atv {
    static double[] fibo = new double[21]; 

    public static void main(String[] args) {
        //usando função pra fazer fibo
        //2 formas de usar metodospara fibonanci
      System.out.println("metodo void");
        getFibo();
        System.out.println("metodo com retorno obrigatorio");
        for (double teste : fibo()) {
        System.out.println(teste);
    }
    }
    public static void getFibo(){
       int x,y,i=0;
       x=1;
       y=0;
       while (i<=20) {
        x=x+y;
       y=x-y;
       i++;
       System.out.println(x);
       }
     
    } 
    public static double[] fibo(){
        int x,y,i=0;
       x=1;
       y=0;
        while (i<=20) {
            x=x+y;
           y=x-y;
          fibo[i] = x;
           i++;
        
        }
        return fibo;
    }}
