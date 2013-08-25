
package clase3.aula.utiles;

public class Matematicas {
    
    public static void main(String[] args) {
        Matematicas.wrappers();
    }
    
    
    public static void wrappers(){
        Integer entero = new Integer(12);
        System.out.println(entero.toString());
    }
    
    public static double doOperaciones(){
        return Math.sqrt(144);
    }
    
    public static void getConstants(){
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
    
    
    
}
