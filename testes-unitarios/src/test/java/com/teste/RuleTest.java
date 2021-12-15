package com.teste;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class RuleTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        File created = tempFolder.newFile("file.txt");

        Assert.assertTrue(created.isFile());
        Assert.assertEquals(tempFolder.getRoot(), created.getParentFile());
    }
}
