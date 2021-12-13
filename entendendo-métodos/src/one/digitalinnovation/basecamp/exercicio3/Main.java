package one.digitalinnovation.basecamp.exercicio3;

public class Main {

    public static void main(String[] args) {
        Quadrilatero quadrilatero = new Quadrilatero();

        int areaQuadrado = quadrilatero.calcularArea(5);
        int areaRetangulo = quadrilatero.calcularArea(5, 2);
        float areaTrapezio = quadrilatero.calcularArea(7, 5, 2);

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
