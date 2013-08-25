package clase3.aula.excepciones.cuentas;

public class Cuenta {

    private double saldoActual;

    public Cuenta() {
        this.saldoActual = 5000;
    }

    public void retirarDeCajero(double cuantoDesea) throws SaldoInsuficienteException {
        if (saldoActual < cuantoDesea) {
            throw new SaldoInsuficienteException(saldoActual, cuantoDesea);
            
        }
            System.out.println("Monto Restante: "+ (saldoActual - cuantoDesea)); 
    }
}
