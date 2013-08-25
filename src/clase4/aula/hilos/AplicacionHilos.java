package clase4.aula.hilos;

public class AplicacionHilos {

    public static void main(String[] args) {
        AplicacionHilos.doHiloImplents();
    }

    public static void doHiloImplents() {
        HiloImplements hilo = new HiloImplements();
        
        Thread th = new Thread(hilo);
        th.setPriority(10);
        th.start();
        
        

    }

    public static void doHiloHerencia() {
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();
    }
}
