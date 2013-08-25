package clase2.tarea.empresarial;

public class Cargo {

    private String nombre;
    private Double sueldoBasico;
    private Cargo[] subordinados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Cargo[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Cargo[] subordinados) {
        this.subordinados = subordinados;
    }
}
