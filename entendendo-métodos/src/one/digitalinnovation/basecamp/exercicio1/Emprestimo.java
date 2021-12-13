package one.digitalinnovation.basecamp.exercicio1;

public class Emprestimo {
    private float valor;
    private int parcelas;

    public Emprestimo(float valor, int parcelas) {
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public void exibirValorFinal() {
        float taxaAplicada = calcularTaxa();
        System.out.println("Valor no final do empréstimo (valor da taxa: " + ((taxaAplicada - 1.0f) * 100) + "%): " + this.valor * taxaAplicada);
    }

    private float calcularTaxa() {
        if (this.parcelas <= 1) return 1f;
        if (this.parcelas <= 3) return 1.5f;
        if (this.parcelas <= 6) return 2f;
        return ((this.parcelas - 6) * 0.2f) + 2f;
    }
}
