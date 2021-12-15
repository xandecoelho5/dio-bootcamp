package com.teste;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty() {
        List<String> lista = new ArrayList<>();
        lista.add("Teste");
        lista.get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTextExceptionMessage() {
        List<Object> list = new ArrayList<>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index 0 out of bounds for length 0");
        list.get(0);
    }

    @Test
    public void textExceptionMessage() {
        try {
            new ArrayList<>().get(0);
            Assert.fail("Esperado que IndexOutOfBoundsException seja lançada");
        } catch (IndexOutOfBoundsException ex) {
            MatcherAssert.assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
