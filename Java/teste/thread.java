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
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                      
              }
            }
        });
        
        Thread teste2 = new Thread(new Runnable(){
            int i=100               ;
            @Override
            public void run(){
                while (i != 0) {
                    System.out.println(i);
                    i=i-1;
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        });
        
        teste2.start();
        teste1.start();
        
 
    }
}
