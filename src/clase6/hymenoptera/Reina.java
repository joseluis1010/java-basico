package clase6.hymenoptera;

public class Reina extends Eurosocial implements TrabajoEurosocial {

    public Reina() {
        this.setCicloDesarrollo(16);
        this.setSexo("f");
    }

    @Override
    public void trabajo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
