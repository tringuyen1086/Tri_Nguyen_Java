package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorObjectTest {

    private CalculatorObject calc;

    @Before
    public void setUp(){
        calc = new CalculatorObject();
    }

    @Test
    public void shouldAddInts(){
        //Arrange
        int expectedResult = 10;

        //Act
        int actualResult = calc.add(7,3);

        //Assert
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void shouldAddDoubles(){
        //Arrange
        double expectedResult = 20.00;

        //Act
        double actualResult = calc.add(15.5,4.5);

        //Assert
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void shouldSubtractInts(){
        //Arrange
        int expectedResult = 2;

        //Act
        int actualResult = calc.subtract(10,8);

        //Assert
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void shouldSubtractDoubles(){
        //Arrange
        double expectedResult = 10.10;

        //Act
        double actualResult = calc.subtract(20.30,10.20);

        //Assert
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void shouldMultiplyInts(){
        //Arrange
        int expectedResult = 100;

        //Act
        int actualResult = calc.multiply(25, 4);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldMultipleDoubles(){
        //Arrange
        double expectedResult = 8.61;

        //Act
        double actualResult = calc.multiply(2.05, 4.20);

        //Assert
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void shouldDivideInts(){
        //Arrange
        int expectedResult = 2;

        //Act
       int actualResult = calc.divide(6,3);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldDivideDoubles(){
        //Arrange
        double expectedResult = 4.50;

        //Act
       double actualResult = calc.divide(20.25,4.50);

        //Assert
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void shouldReturnZero(){
        //Arrange
        int expectedResult = 0;


        //Act
        int actualResult = calc.divide(2, 0);


        //Assert
        assertEquals(expectedResult, actualResult);
    }
}