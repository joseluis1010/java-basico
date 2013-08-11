package clase2.aula.zoologico;

public class Tigre extends Animal {

    public Tigre() {
        this.setNumeroPatas(4);
    }

    public Tigre(String nombre) {
        this.setNumeroPatas(4);
        this.setNombre(nombre);
    }

    @Override
    void hacerRuido() {
        System.out.println("rugir");
    }

    void hacerRuido(boolean molestar) {
        if (molestar) {
            System.out.println("rugir y zarpar");
        }
    }

    void hacerRuido(String mensaje) {
        System.out.println("rugir " + mensaje);
    }

    void zarpar() {
        System.out.println("Estoy ZARPANDO");
    }
}
