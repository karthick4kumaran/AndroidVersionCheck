package org.example;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;


public class AppTest {
    @Test
    public void shouldAnswerWithTrue() throws Exception {
        System.out.println(System.getProperty("IOS_VERSION"));
        System.setProperty("IOS_VERSION","12");
        assertTrue( true );

    }
}
