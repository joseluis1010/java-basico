package clase3.aula.usoInterface;

public class Oracion implements Capitalizable {

    private String texto;

    public Oracion(String texto) {
        this.texto = texto;
    }

    public String agregaPalabra(String t) {
        texto = texto.concat(" " + t);
        return texto;
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
