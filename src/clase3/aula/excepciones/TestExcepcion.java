package clase3.aula.excepciones;

import clase3.aula.excepciones.cuentas.Cuenta;
import clase3.aula.excepciones.cuentas.SaldoInsuficienteException;

public class TestExcepcion {

    public static void main(String[] args) throws SaldoInsuficienteException {
        TestExcepcion.doEjemplo4Exception();
    }

    public static void doEjemplo4Exception() {
        try {
            Cuenta cuentaJose = new Cuenta();
            cuentaJose.retirarDeCajero(6000d);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void doEjemplo4() throws SaldoInsuficienteException {
        Cuenta cuentaJose = new Cuenta();
       // cuentaJose.retirarDeCajero(8000d);

    }

    public static void doEjemplo3Exception() {
        try {
            int[] n = {11, 22, 33, 44, 55, 66, 77, 88, 99};

            for (int i = 0; i < 11; i++) {
                System.out.println("Valor " + n[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Aplicacion Terminada ");
        }

    }

    public static void doEjemplo3() {
        int[] n = null;

        for (int i = 0; i < 11; i++) {
            System.out.println("Valor " + n[i]);
        }
    }

    public static void doEjemplo2() {
        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 10);
        int[] z = new int[5];

        try {
            System.out.println("y/x gives " + (y / x));
            System.out.println("y is " + y + ", z[y] is " + z[y]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Subscript problem " + e);

        } finally {
            System.out.println("Terminando la ejecución del método");
        }


        System.out.println("Continúa la ejecución del método....");


    }

    public static void doEjemplo1() {
        int i = 10, u = 0, k;
        k = i / u;
    }

    public static void doEjemplo1Exception() {
        try {
            int i = 0, u = 0, k;
            k = i / u;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
