package clase3.aula.excepciones.cuentas;

public class SaldoInsuficienteException extends Exception {


    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene " + saldo + " soles. No puede retirar " + cuantoDesea + " soles.");
    }
}
