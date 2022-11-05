package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior warrior;

    @Before
    public void setUp(){
        warrior = new Warrior("Warr", 75, 100, 100, 50, 10, false, false, 100);
    }


    @Test
    public void shouldGreeting(){
        //Arrange
        String expectedValue = "Hello, my name is Warr. I am a warrior.";

        //Act
        String actualValue = warrior.greeting();

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}