package clase4.aula.hilos;

public class RamThread extends Thread {

    private int opcion;

    public RamThread(int opcion) {
        this.opcion = opcion;
    }

    @Override
    public void run() {
        String mensaje;
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (this.opcion) {
                case 1:
                    mensaje = "Memoria Libre: " + Runtime.getRuntime().freeMemory();
                    break;
                case 2:
                    mensaje = "Microprocesador: " + Runtime.getRuntime().availableProcessors();
                    break;
                default:
                    mensaje = "opción no definida";
                    break;
            }
            
            System.out.println(mensaje);

        }

    }
}
