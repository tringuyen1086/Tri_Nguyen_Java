package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    private Constable constAble;

    @Before
    public void setUp(){
        constAble = new Constable("Const", 60, 100, 60, 20, 5, false, false, "Jurisdiction");
    }

    @Test
    public void shouldGreeting(){
        //Arrange
        String expectedValue = "Hello, my name is Const. I am a constable.";

        //Act
        String actualValue = constAble.greeting();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldArrestAnotherCharacter(){
        //Arrange
        String expectedValue = "I am about to arrest warrior Warr!";

        //Act
        String actualValue = constAble.arrest("warrior Warr");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldHaveJurisdiction(){
        //Arrange
        String expectedValue = "I have jurisdiction over warrior Warr!";

        //Act
        String actualValue = constAble.jurisdiction("warrior Warr");

        //Assert
        assertEquals(expectedValue, actualValue);

    }


}