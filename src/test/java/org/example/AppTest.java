package org.example;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;


public class AppTest {
    @Test
    public void shouldAnswerWithTrue() throws Exception {
        System.out.println("Old Version of Android is "+System.getProperty("android"));
        System.setProperty("android","11");
        System.out.println("New Version of Android is "+System.getProperty("android"));
        assertTrue( true );

    }
}
