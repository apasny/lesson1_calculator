package com.epam.calculator;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    public final double FIRST_ARGUMENT_POSITIVE = 1.1;
    public final double SECOND_ARGUMENT_POSITIVE = 3.1;
    public final double FIRST_ARGUMENT_NEGATIVE = -1.1;
    public final double SECOND_ARGUMENT_NEGATIVE = -3.1;

    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.add(FIRST_ARGUMENT_POSITIVE, SECOND_ARGUMENT_POSITIVE);

        //then
        Assertions.assertEquals(4.2, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.add(FIRST_ARGUMENT_NEGATIVE, SECOND_ARGUMENT_NEGATIVE);

        //then
        Assertions.assertEquals(-4.2, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.multiply(FIRST_ARGUMENT_POSITIVE, SECOND_ARGUMENT_POSITIVE);

        //then
        Assertions.assertEquals(3.41, Precision.round(result, 8));
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.multiply(FIRST_ARGUMENT_NEGATIVE, SECOND_ARGUMENT_NEGATIVE);

        //then
        Assertions.assertEquals(3.41, Precision.round(result, 8));
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.subtract(FIRST_ARGUMENT_POSITIVE, SECOND_ARGUMENT_POSITIVE);

        //then
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void testSubtractShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.subtract(FIRST_ARGUMENT_NEGATIVE, SECOND_ARGUMENT_NEGATIVE);

        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(FIRST_ARGUMENT_POSITIVE, SECOND_ARGUMENT_POSITIVE);

        //then
        Assertions.assertEquals(0.3548387096774194, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(FIRST_ARGUMENT_NEGATIVE, SECOND_ARGUMENT_NEGATIVE);

        //then
        Assertions.assertEquals(0.3548387096774194, result);
    }
}
