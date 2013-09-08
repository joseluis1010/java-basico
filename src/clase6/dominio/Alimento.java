package clase6.dominio;

import java.util.HashMap;

public class Alimento {

    String nombre;
    String unidadMedida;
    TipoAlimento tipo;
    Double costo;
    Double valorNutricional;
    HashMap<Nutriente, Double> nutrientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlimento tipo) {
        this.tipo = tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getValorNutricional() {
        return valorNutricional;
    }

    public void setValorNutricional(Double valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    public HashMap<Nutriente, Double> getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(HashMap<Nutriente, Double> nutrientes) {
        this.nutrientes = nutrientes;
    }

    
}
