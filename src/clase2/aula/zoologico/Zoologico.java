package clase2.aula.zoologico;

import clase3.aula.utiles.ClaseObject;

public class Zoologico {

    public static String nombre;

    public static void main(String[] args) {
        
        Tigre tigreJorge = new Tigre("Jorge");
        Tigre tigreJose = new Tigre("Jorge");
        
        System.out.println(tigreJorge.equals(tigreJose));
        
        
    }

    
    public static void executeCasting() {
        Gallina gallina = new Gallina();
        Zoologico.doCasting1(gallina);
        Zoologico.doCasting1(new Tigre());
    }

    public static void doCasting2() {

        Animal[] animales = {new Tigre("TIGR"), new Gallina("MAMBA"), new Gallina("PEPA")};

        for (Animal animal : animales) {
            animal.printNombrePatas();

            if (animal instanceof Tigre) {
                ((Tigre) animal).hacerRuido(true);

            } else if (animal instanceof Gallina) {
                Gallina gallina = (Gallina) animal;
                gallina.picar();
            }
        }

    }

    public static void doCasting1(Animal animal) {
        if (animal instanceof Tigre) {
            ((Tigre) animal).hacerRuido(true);

        } else if (animal instanceof Gallina) {
            Gallina gallina = (Gallina) animal;
            gallina.hacerRuido();
            gallina.picar();

        }
    }

    public static void doConstructor() {

        Gallina pepa = new Gallina();
        pepa.setNombre("PEPA");
        pepa.printNombrePatas();


        Gallina mamba = new Gallina("MAMBA");
        mamba.printNombrePatas();

        Tigre tigre = new Tigre("Rafael");
        tigre.printNombrePatas();


    }

    public static void doHerencia() {
        Tigre tiger = new Tigre();
        tiger.setNumeroPatas(4);
        tiger.hacerRuido();
        System.out.println(tiger.getNumeroPatas());
        tiger.hacerRuido(true);
        tiger.hacerRuido("grr");


        Gallina pepa = new Gallina();
        pepa.setNumeroPatas(2);
        System.out.println(pepa.getNumeroPatas());
        pepa.hacerRuido();


    }

    public static void doInstance() {
        Animal tigre = new Animal();
        tigre.setNombre("Tigrrrr");
        System.out.println(tigre.getNombre());

        tigre.hacerRuido();
    }
}
