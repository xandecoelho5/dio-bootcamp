package com.teste;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        Assert.assertEquals(5, soma);
    }

    @Test
    public void testeSomarComMock() {
        Calculadora calculadora = Mockito.mock(Calculadora.class);

        Mockito.when(calculadora.somar("1+2")).thenReturn(10);

        int resultado = calculadora.somar("1+2");

        Assert.assertEquals(10, resultado);
    }
}
