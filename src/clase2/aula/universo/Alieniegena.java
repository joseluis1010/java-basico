
package clase2.aula.universo;

import clase2.aula.universo.interfaces.SerVivo;

public class Alieniegena implements SerVivo{

    @Override
    public void alimentarse() {
        System.out.println("ENERGIA");
    }

    @Override
    public void comunicarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproducirse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
    
}
