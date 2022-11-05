package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    private Converter converter;

    @Before
    public void setUp(){
        converter = new ConverterIf();
        converter = new ConverterSwitch();
    }

    @Test
    public void shouldReturnWeekdayIf(){
        //Arrange
        String expectedValue = "Sunday";

        //act
        String actualValue = converter.convertDay(1);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test

    public void shouldReturnMonthIf(){
        //Arrange
        String expectedValue = "October";

        //Act
        String actualValue = converter.convertMonth(10);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldReturnWeekdaySwitch(){
        //Arrange
        String expectedValue = "Saturday";

        //Act
        String actualValue = converter.convertDay(7);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test

    public void shouldReturnMonthSwitch(){
        //Arrange
        String expectValue = "May";

        //Act
        String actualValue = converter.convertMonth(5);

        //Assert
        assertEquals(expectValue, actualValue);
    }
}
