package clase5.aula.sockets.operaciones;

import clase5.aula.sockets.servidores.*;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServidorHilo {

    private int port;

    public AppServidorHilo(int port) {
        this.port = port;
    }
    
    public static void main(String[] args) {
        AppServidorHilo play = new AppServidorHilo(9999);
        play.ejecutar();
    }

    public void ejecutar() {
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");

            while (true) {
                System.out.println("Esperando ...");
                Socket cliente = server.accept();

                OperacionesHilo ts = new OperacionesHilo(cliente);
                ts.start();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
