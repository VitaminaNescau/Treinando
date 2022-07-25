package teste;

public class thread {
    public static void main(String[] args) {
        
        // teste de conhecimento do @Override e de thread
       
        
        Thread teste1 = new Thread(new Runnable() {
            int i;
            @Override
            public void run(){
              while(i != 100){
                System.out.println(i);
                i= i+1;  
              }
            }
        });
        
        
       // Thread.sleep(5000);
      
        Thread teste2 = new Thread(new Runnable(){
            int i=100               ;
            @Override
            public void run(){
                while (i != 0) {
                   
                    System.out.println(i);
                    i=i-1;
                }
            }
        });
        
        teste2.start();
        teste1.start();
       // Thread.sleep(5000);
 
    }
}
