package com.teste;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraNovaTest {

    @Test
    public void deveSomarDoisValores() {
        int valorA = 1;
        int valorB = 2;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int soma = calculadoraNova.somar(valorA, valorB);

        Assert.assertEquals(3, soma);
    }

    @Test
    public void deveSomarTresValores() {
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int soma = calculadoraNova.somar(valorA, valorB, valorC);

        Assert.assertEquals(6, soma);
    }
}
