package one.digitalinnovation.basecamp.exercicio3;

public class Quadrilatero {

    public int calcularArea(int lado) {
        return lado * lado;
    }

    public int calcularArea(int base, int altura) {
        return base * altura;
    }

    public float calcularArea(int baseMaior, int baseMenor, int altura) {
        return ((baseMaior + baseMenor) * altura) / 2.f;
    }
}
