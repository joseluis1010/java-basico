package clase2.aula.figuras;

public class Cuadrado extends Shape {

    @Override
    public Double getArea() {
        Double resultado = this.getAlto()*this.getAlto();
        return resultado;
    }
    
    public void setLado(Double lado){
        this.setAlto(lado);
        this.setAncho(lado);
    }
}
