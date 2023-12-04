package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void TestNumberOutput(){
        String output = Main.getNumberOutput("1234");
        assertEquals("Valid PIN",output);
        String output2 = Main.getNumberOutput("12345");
        assertEquals("Invalid PIN",output2);
        String output3 = Main.getNumberOutput("ABCD");
        assertEquals("Invalid PIN",output3);
    }

}
