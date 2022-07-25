/**
 * Author: Yun Ni
 * Student ID: 40179775
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublePowerTest {

    @Test
    public void zeroPowerZero() throws Exception {
        assertEquals(1.0, ExponentFunction.power(0.0, 0.0));
    }

    @Test
    public void zeroPowerRationalNumber() throws Exception {

        assertEquals(0.0,ExponentFunction.power(0.0, 5.8));
    }

    @Test
    public void positiveNumberPowerZero() throws Exception {
        assertEquals(1.0, ExponentFunction.power(7, 0.0));
    }

    @Test
    public void negativeNumberPowerZero() throws Exception {
        assertEquals(1.0, ExponentFunction.power(-4, 0.0));
    }

    @Test
    public void positiveNumberPowerOne() throws Exception {
        assertEquals(6.999999998420569, ExponentFunction.power(7.0, 1.0));
    }

    @Test
    public void positiveNumberPowerPositiveNumber() throws Exception {
        assertEquals(1.2712163508293848E7, ExponentFunction.power(5.4, 9.7));
    }


    @Test
    public void negativeNumberPowerNegativeNumber() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            ExponentFunction.power(-5.5, -9.6);
        });

        assertTrue(exception.getMessage().contains("The range of the math has errors"));

    }

    @Test
    public void negativeNumberPowerPositiveEvenNumber() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            ExponentFunction.power(-30.7, 41.3);
        });

        assertTrue(exception.getMessage().contains("The range of the math has errors"));
    }
}