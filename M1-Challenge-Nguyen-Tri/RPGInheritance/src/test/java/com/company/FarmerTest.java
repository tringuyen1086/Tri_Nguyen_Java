package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    private Farmer farmEr;

    @Before

    public void setUp(){
        farmEr = new Farmer("Farm", 75, 100, 75, 10, 1, false, false, false, false);
    }

    @Test
    public void shouldGreeting(){
        //Arrange
        String expectedValue = "Hello, my name is Farm. I am a farmer.";

        //Act
        String actualValue = farmEr.greeting();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

}