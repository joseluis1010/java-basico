
package clase6.hymenoptera;

import clase6.hymenoptera.especie.Abeja;

public class Eurosocial extends Abeja{
    
    public Integer cicloDesarrollo;
    public String sexo;
    public String celda;
    public String lugarTrabajo;

    public Integer getCicloDesarrollo() {
        return cicloDesarrollo;
    }

    public void setCicloDesarrollo(Integer cicloDesarrollo) {
        this.cicloDesarrollo = cicloDesarrollo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelda() {
        return celda;
    }

    public void setCelda(String celda) {
        this.celda = celda;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }
    
    
    
    
}
