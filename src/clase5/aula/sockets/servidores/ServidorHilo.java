package clase5.aula.sockets.servidores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class ServidorHilo extends Thread {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            out.println("SERVIDOR PROFESOR: Bienvenido, ¿Cómo te llamas? ");

            String resp2 = in.readLine();
            System.out.println(resp2+" "+new Date());
            in.close();
            out.close();
            cliente.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }


    }
}
