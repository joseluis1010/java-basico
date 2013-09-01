package clase5.aula.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacionObjeto {

    public static void main(String[] args) {
        SerializacionObjeto.serializarPersona();
        SerializacionObjeto.descerializarPersona();
    }

    public static void serializarPersona() {
        ObjectOutputStream salida = null;
        Persona p1 = new Persona("Alonso", 23);
        
        try {
            FileOutputStream archivo = new FileOutputStream("C:\\tareajava\\objetos\\Persona.objeto");
            salida = new ObjectOutputStream(archivo);
            salida.writeObject(p1);
            salida.flush();
        } catch (IOException e) {
            System.out.println("Imposible crear el archivo o escribir en él");
        } finally {
            try {
                salida.close();
            } catch (IOException e) {
                System.out.println("No pudo cerrarse el canal");
            }
        }
    }

    public static void descerializarPersona() {

        File archivo = new File("C:\\tareajava\\objetos\\Persona.objeto");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
           
            Persona alonso = (Persona) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Persona recuperada: " + alonso.toString());
        } catch (IOException e) {
            System.err.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }


    }
}
