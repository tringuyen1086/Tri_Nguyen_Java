package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseCharacterPropertiesTest {

    private BaseCharacterProperties baseCharacter;

    @Before
    public void setUp(){
        baseCharacter = new BaseCharacterProperties("Base", 75, 100, 75, 10, 1, false, false);
    }

    @Test
    public void attacks(){
        //Arrange
        String expectedValue = "Base attacked Another Character";

        //Act
        String actualValue = baseCharacter.attacks("Another Character");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

}