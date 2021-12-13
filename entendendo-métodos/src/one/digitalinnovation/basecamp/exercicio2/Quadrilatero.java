package one.digitalinnovation.basecamp.exercicio2;

public class Quadrilatero {

    public void calcularArea(int lado) {
        System.out.println("Área do quadrado: " + (lado * lado));
    }

    public void calcularArea(int base, int altura) {
        System.out.println("Área do retângulo: " + (base * altura));
    }

    public void calcularArea(int baseMaior, int baseMenor, int altura) {
        System.out.println("Área do trapézio: " + (((baseMaior + baseMenor) * altura) / 2));
    }
}
