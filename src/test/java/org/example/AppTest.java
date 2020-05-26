package org.example;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Properties;

import static org.testng.AssertJUnit.assertTrue;


public class AppTest {
    @Test
    public void shouldAnswerWithTrue() throws Exception {
        PrintWriter pw = new PrintWriter("updatedVersion.txt");
        pw.write("12");
        pw.close();

    }
}
