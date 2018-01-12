package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        //test for adding num1 and num2 (num1+num2)
        assertEquals(2, calculator.add(1,1));
        assertEquals(0, calculator.add(1,-1));
        //assertNotEquals();

    }
    @Test
    public void subtraction() throws Exception {
        Calculator calculator = new Calculator();
        //test for subtracting num1 and num2 (num1-num2)
        assertEquals(0, calculator.subtraction(1, 1));
        assertEquals(3, calculator.subtraction(9, 6));
    }
    @Test
    public void multi() throws Exception{
        Calculator calculator = new Calculator();
        //test for multiplying num1 and num2 (num1 *num2)
        assertEquals(9, calculator.multi(3,3));
        assertEquals(1, calculator.multi(1,1));
    }
    @Test
    public void divide() throws Exception{
        Calculator calculator = new Calculator();
        //test for dividing num1 and num2 (num1/num2)
        assertEquals(1, calculator.divide(1,1));
        assertEquals(5,calculator.divide(25,5));
    }

}