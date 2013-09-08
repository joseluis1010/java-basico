package clase6.dominio;

import java.util.HashMap;

public class Dieta {

    Double agua;
    HashMap<Alimento, Double> alimentos;

    public Double getAgua() {
        return agua;
    }

    public void setAgua(Double agua) {
        this.agua = agua;
    }

    public HashMap<Alimento, Double> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(HashMap<Alimento, Double> alimentos) {
        this.alimentos = alimentos;
    }
}
