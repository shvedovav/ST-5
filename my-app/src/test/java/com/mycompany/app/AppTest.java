package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final double delta = 1e-7;

    @Test
    public void testSqrtOf1() {
        assertEquals(1.0, new Sqrt(1.0).calc(), delta);
    }

    @Test
    public void testSqrtOf4() {
        assertEquals(2.0, new Sqrt(4.0).calc(), delta);
    }

    @Test
    public void testSqrtOf9() {
        assertEquals(3.0, new Sqrt(9.0).calc(), delta);
    }

    @Test
    public void testSqrtOf0_25() {
        assertEquals(0.5, new Sqrt(0.25).calc(), delta);
    }

    @Test
    public void testSqrtOf2() {
        assertEquals(Math.sqrt(2.0), new Sqrt(2.0).calc(), delta);
    }

    @Test
    public void testSqrtOf3() {
        assertEquals(Math.sqrt(3.0), new Sqrt(3.0).calc(), delta);
    }

    @Test
    public void testSqrtOf10() {
        assertEquals(Math.sqrt(10.0), new Sqrt(10.0).calc(), delta);
    }

    @Test
    public void testSqrtOf0_0001() {
        assertEquals(0.01, new Sqrt(0.0001).calc(), delta);
    }

    @Test
    public void testSqrtOf10000() {
        assertEquals(100.0, new Sqrt(10000.0).calc(), delta);
    }

    @Test
    public void testSqrtOf123_456() {
        double arg = 123.456;
        double result = new Sqrt(arg).calc();
        assertTrue(Math.abs(result * result - arg) < delta);
    }

    @Test
    public void testSqrtOf1e8() {
        double arg = 1e-8;
        double result = new Sqrt(arg).calc();
        assertTrue(Math.abs(result * result - arg) < delta);
    }

    @Test
    public void testSqrtOf1e6() {
        assertEquals(1000.0, new Sqrt(1_000_000.0).calc(), delta);
    }

    @Test
    public void testSqrtOfNonPerfectSquare() {
        double arg = 5.5;
        double result = new Sqrt(arg).calc();
        assertEquals(Math.sqrt(arg), result, delta);
    }

    @Test
    public void testThatResultSquaredIsCloseToOriginalForSmallValue() {
        double arg = 0.0000001;
        double result = new Sqrt(arg).calc();
        assertTrue(Math.abs(result * result - arg) < delta);
    }

    @Test
    public void testThatResultSquaredIsCloseToOriginalForBigValue() {
        double arg = 987654321;
        double result = new Sqrt(arg).calc();
        assertTrue(Math.abs(result * result - arg) < delta);
    }

    @Test
    public void testResultNotNegative() {
        double result = new Sqrt(16.0).calc();
        assertTrue(result >= 0.0);
    }
}
