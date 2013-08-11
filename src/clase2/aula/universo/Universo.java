package clase2.aula.universo;

public class Universo {

    public static void main(String[] args) {
        Hombre hombre = new Hombre();
        hombre.alimentarse();
        hombre.contaminar();
        
        
        ETMarte et = new ETMarte();
        et.alimentarse();
        et.volarBicicleta();

    }
}
