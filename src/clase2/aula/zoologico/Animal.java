package clase2.aula.zoologico;

public class Animal {

    private int numeroPatas;
    private Double tamaño;
    private String nombre;
    private String especie;

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    void hacerRuido() {
        System.out.println("ZZZZZ");

    }

    void printNombrePatas() {
        System.out.println(this.nombre + " " + this.numeroPatas);
    }
}
