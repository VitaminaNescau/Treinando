package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.print.event.PrintEvent;

public class servidor {
    public static void main(String[] args) {
        final ServerSocket sS;
        final Socket cS;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner sc = new Scanner(System.in);
        try {
            sS = new ServerSocket(3030);
            cS = sS.accept();
            out = new PrintWriter(cS.getOutputStream());
            in = new BufferedReader(new InputStreamReader(cS.getInputStream()));
        } catch (IOException e) {
            System.out.println("Erro: "+e);
        }

        Thread sender = new Thread(new Runnable() {
            String msg; // variavel q contera oq o usuario escrever 
            @Override // estou sobrescrevendo o metodo run
            public void run(){
                while(true){
                    msg = sc.nextLine();//usando  o objeto da classe Scanner para atribuir  a mensagem
                    out.println(msg);// escreve os dados para o cS(clientSocket)
                    out.flush();// força o envio dos dados
                }
                }   
        });
        sender.start();
    
        Thread receive = new Thread(new Runnable() {
            String msg;
            @Override
            public void run(){
                try {
                    msg = in.readLine();// leitura dos dados enviados para o clientSocket usando "in"
                    while (msg != null) {
                        System.out.println("Cliente: "+msg); // mostra a mensagem enviado do cliente 
                        msg = in.readLine();
                    }

                        System.out.println("Cliente desconectado");
                        out.close();
                        cS.close();
                        sS.close();
                    } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
        receive.start();
    }
}
