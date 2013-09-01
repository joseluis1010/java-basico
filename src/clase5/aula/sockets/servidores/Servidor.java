package clase5.aula.sockets.servidores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int port;

    public Servidor(int port) {
        this.port = port;
    }

    public static void main(String[] args) {
        Servidor socketServer = new Servidor(9999);
        socketServer.ejecutar();
    }

    public void ejecutar() {
        try {

            ServerSocket server = new ServerSocket(port);

            while (true) {
                System.out.println("Servidor iniciado...");
                Socket cliente = server.accept();

                PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

                out.println("SERVIDOR PROFESOR: Bienvenido, ¿Cómo te llamas? ");

                String resp2 = in.readLine();
                System.out.println(resp2);
                in.close();
                out.close();
                cliente.close();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }


    }
}
