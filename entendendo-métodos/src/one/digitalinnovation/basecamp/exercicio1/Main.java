package one.digitalinnovation.basecamp.exercicio1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
        int value1 = 10, value2 = 5;

        Calculadora.soma(value1, value2);
        Calculadora.subtracao(value1, value2);
        Calculadora.multiplicacao(value1, value2);
        Calculadora.divisao(value1, value2);

        System.out.println();

        // A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite
        Mensagem mensagemHoraAtual = new Mensagem();
        Mensagem mensagemOutraHora = new Mensagem(LocalDateTime.now().plusHours(6));

        mensagemHoraAtual.exibirMensagem();
        mensagemOutraHora.exibirMensagem();

        System.out.println();

        // Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
        // Defina arbitrariamente as faixas que influenciam nos valores.
        List<Emprestimo> emprestimos = new ArrayList<>();
        emprestimos.add(new Emprestimo(500, 1));
        emprestimos.add(new Emprestimo(500, 3));
        emprestimos.add(new Emprestimo(500, 5));
        emprestimos.add(new Emprestimo(500, 7));
        emprestimos.add(new Emprestimo(500, 12));
        emprestimos.forEach(Emprestimo::exibirValorFinal);
    }
}
