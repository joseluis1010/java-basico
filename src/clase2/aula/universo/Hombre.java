package clase2.aula.universo;

import clase2.aula.universo.interfaces.Humano;
import clase2.aula.universo.interfaces.SerVivo;

public class Hombre implements SerVivo, Humano {

    @Override
    public void alimentarse() {
        System.out.println("COMER");
    }

    @Override
    public void comunicarse() {
        System.out.println("HABLAR");

    }

    @Override
    public void reproducirse() {
        System.out.println("SEXUALMENTE");
    }

    @Override
    public void contaminar() {
        System.out.println("votar desechos");
    }
}
