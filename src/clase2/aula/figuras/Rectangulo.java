
package clase2.aula.figuras;

public class Rectangulo extends Shape{

    @Override
    public Double getArea() {
        return this.getAlto()*this.getAncho();
        
    }

}
