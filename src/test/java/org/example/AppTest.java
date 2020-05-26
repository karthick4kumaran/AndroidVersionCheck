package org.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class AppTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        System.setProperty("AndroidVersion","NewAndroidVersionReleased");
        System.setProperty("IOSVersion","NewIOSVersionReleased");
        assertTrue( true );

    }
}
