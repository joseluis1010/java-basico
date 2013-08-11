package clase2.aula.zoologico;

public class Gallina extends Animal {

    String pico;

    public Gallina() {
        this.setNumeroPatas(2);
    }

    public Gallina(String nombre) {
        this.setNumeroPatas(2);
        this.setNombre(nombre);
    }

    @Override
    void hacerRuido() {
        System.out.println("coc coc");
    }

    void picar() {
        System.out.println("ESTOY PICANDO");
    }
}
