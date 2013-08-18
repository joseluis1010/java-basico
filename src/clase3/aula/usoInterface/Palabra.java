package clase3.aula.usoInterface;

public class Palabra implements Capitalizable {

    String texto;

    public Palabra(String n) {
        texto = n.replaceAll(" ", "");
    }

    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
}
