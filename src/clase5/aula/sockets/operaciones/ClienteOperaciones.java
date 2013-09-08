package clase5.aula.sockets.operaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteOperaciones {

    private String host;
    private int port;

    public ClienteOperaciones(String host, int port) {
        this.host = host;
        this.port = port;
    }
    
    public static void main(String[] args) {
        ClienteOperaciones socketCliente = new ClienteOperaciones("localhost", 9999);
        socketCliente.doConectar();
    }
    

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);

            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            String msg = in.readLine();
            System.out.println(msg);

            out.println("3");
            out.println("10");
            out.println("20");
            
            System.out.println(in.readLine());

            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}
