package clase4.aula.hilos;

public class AplicacionHilos {

    public static void main(String[] args) {
        AplicacionHilos.doRamThread();
    }
    
    public static void doRamThread(){
        RamThread ramThread = new RamThread(100);
        ramThread.start();
    }

    public static void doSleep2Priority() {
        Simple2DelayThread thread1 = new Simple2DelayThread("thread1", 0);
        Simple2DelayThread thread2 = new Simple2DelayThread("thread2", 0);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }

    public static void doSleep2() {
        int delay1 = (int) (Math.random() * 2000);
        int delay2 = (int) (Math.random() * 2000);
        int delay3 = (int) (Math.random() * 2000);

        Simple2DelayThread thread1 = new Simple2DelayThread("thread1", delay1);
        Simple2DelayThread thread2 = new Simple2DelayThread("thread2", delay2);
        Simple2DelayThread thread3 = new Simple2DelayThread("thread3", delay3);

        thread1.start();
        thread2.start();
        thread3.start();

    }

    public static void doSleep() {
        SimpleDelayThread delay = new SimpleDelayThread();

        delay.start();
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
