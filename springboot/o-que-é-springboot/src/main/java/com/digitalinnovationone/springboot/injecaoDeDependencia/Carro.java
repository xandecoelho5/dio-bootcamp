package com.digitalinnovationone.springboot.injecaoDeDependencia;

public class Carro implements Veiculo {

    @Override
    public void acao() {
        System.out.println("É um carro.");
    }
}
