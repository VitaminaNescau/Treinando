package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class cliente {
   public static void main(String[] args){
    final ServerSocket sS;
    final Socket cS;
    final BufferedReader in;
    final PrintWriter out;
    final Scanner sc = new Scanner(System.in);
   
    try {
        cS = new Socket("127.0.0.1", 3030);
        out = new PrintWriter(cS.getOutputStream());
        in = new BufferedReader(new InputStreamReader(cS.getInputStream()));
        Thread sender = new Thread(new Runnable() {
            String msg;
            @Override
            public void run(){
             while(true){
                 msg = sc.nextLine();
                 out.println(msg);
                 out.flush();
             }
            } 
         });
         sender.start();
         Thread receive = new Thread(new Runnable() {
             String msg;
             @Override
             public void run() {
                 try {
                     msg = in.readLine();
                     while (msg!=null) {
                         System.out.println("Servidor: " + msg);
                         msg = in.readLine();
                     }
                     System.out.println("Servido fora do ar");
                     out.close();
                     cS.close();
                 } catch (Exception e) {
                     System.out.println(e);
                 }
                 
             }
         });
         receive.start();
    } catch (IOException e) {
       System.out.println(e);
    }
   

}

}
