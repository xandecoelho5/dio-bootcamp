package com.teste;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void testAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        Assert.assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEquals() {
        Assert.assertEquals("text", "text");
    }

    @Test
    public void testAssertFalse() {
        Assert.assertFalse(false);
    }

    @Test
    public void testAssertNotNull() {
        Assert.assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame() {
        Assert.assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        Assert.assertNull(null);
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = 765;
        Assert.assertSame(aNumber, aNumber);
    }
}
