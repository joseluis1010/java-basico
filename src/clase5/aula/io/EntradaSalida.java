package clase5.aula.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EntradaSalida {

    public static void main(String[] args) {
        EntradaSalida.ejemploIO();
    }

    public static void ejemploIO() {
        try {


            List<String> listado = new ArrayList<String>();

            FileReader fr = new FileReader("c:\\tareajava\\files\\pruebas.txt");
            BufferedReader br = new BufferedReader(fr);
            String sInput;
            while ((sInput = br.readLine()) != null) {
                listado.add(sInput);
            }
            br.close();
            fr.close();


            FileWriter fw = new FileWriter("c:\\tareajava\\files\\pruebas.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (String string : listado) {
                bw.write(string);
                bw.newLine();
            }
            bw.write("Es una linea");
            bw.newLine();
            bw.write("Es otra linea");
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void leerArchivo() {
        try {
            FileReader fr = new FileReader("c:\\tareajava\\files\\pruebas.txt");
            BufferedReader br = new BufferedReader(fr);
            String sInput;
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void escribirArchivo() {
        try {
            FileWriter fw = new FileWriter("c:\\tareajava\\files\\pruebas.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Es una linea");
            bw.newLine();
            bw.write("Es otra linea");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
