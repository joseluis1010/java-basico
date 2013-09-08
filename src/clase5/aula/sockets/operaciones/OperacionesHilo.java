package clase5.aula.sockets.operaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class OperacionesHilo extends Thread {

    private Socket cliente;

    public OperacionesHilo(Socket cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            out.println("Calculadora...");

            Integer parametro1 = Integer.parseInt(in.readLine());
            Integer parametro2 = Integer.parseInt(in.readLine());

            Integer respuesta = parametro1 + parametro2;
            
            out.println(respuesta);
            
            in.close();
            out.close();
            cliente.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }


    }
}
