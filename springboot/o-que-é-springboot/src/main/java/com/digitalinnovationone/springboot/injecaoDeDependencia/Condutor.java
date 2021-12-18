package com.digitalinnovationone.springboot.injecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

    @Autowired
    private Veiculo veiculo;

    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Moto());
        condutor.automovel();
    }

    public Condutor(Veiculo obj) {
        this.veiculo = obj;
    }

    public void automovel() {
        veiculo.acao();
    }
}
