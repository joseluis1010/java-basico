package clase6.dominio;

import java.util.Date;
import java.util.HashMap;

public class Animal {
    
    Integer codigo;
    Especie especie;
    String nombre;
    Double peso;
    Date fechaNacimento;
    String observaciones;
    HashMap<Dieta, Integer> dietas;
    
    

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public HashMap<Dieta, Integer> getDietas() {
        return dietas;
    }

    public void setDietas(HashMap<Dieta, Integer> dietas) {
        this.dietas = dietas;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Date getFechaNacimento() {
        return fechaNacimento;
    }

    public void setFechaNacimento(Date fechaNacimento) {
        this.fechaNacimento = fechaNacimento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
