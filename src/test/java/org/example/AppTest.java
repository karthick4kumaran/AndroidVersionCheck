package org.example;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import static org.testng.AssertJUnit.assertTrue;


public class AppTest {
    @Test
    public void shouldAnswerWithTrue() throws Exception {
        Properties prop = new Properties();
        prop.load(new FileReader(new File("output.properties")));
        prop.setProperty("android","10");
        prop.setProperty("ios","11");
        prop.setProperty("xcode","12");
        assertTrue( true );

    }
}
