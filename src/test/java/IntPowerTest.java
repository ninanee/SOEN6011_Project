import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntPowerTest {


    @Test
    public void zeroPowerZero() {
        assertEquals(1.0, ExponentFunction.power(0, 0));
    }

    @Test
    public void zeroPowerRealNumber() {
        assertEquals(0.0, ExponentFunction.power(0, 3));
    }

    @Test
    public void positiveNumberPowerZero() {
        assertEquals(1.0, ExponentFunction.power(7, 0));
    }

    @Test
    public void negativeNumberPowerZero() {
        assertEquals(1.0, ExponentFunction.power(-4, 0));
    }

    @Test
    public void positiveNumberPowerOne() {
        assertEquals(7.0, ExponentFunction.power(7, 1));
    }

    @Test
    public void positiveNumberPowerPositiveNumber() {
        assertEquals(1953125.0, ExponentFunction.power(5, 9));
    }

    @Test
    public void negativeNumberPowerNegativeNumber() {
        assertEquals(-5.12E-7, ExponentFunction.power(-5, -9));
    }

    @Test
    public void negativeNumberPowerPositiveEvenNumber() throws Exception {
        assertEquals(81, ExponentFunction.power(-3, 4));
    }

    @Test
    public void negativeNumberPowerPositiveOddNumber() {
        assertEquals(-729, ExponentFunction.power(-9, 3));
    }

    @Test
    public void negativeNumberPowerNegativeEvenNumber() throws Exception {
        assertEquals(0.012345679012345678, ExponentFunction.power(-3, -4));
    }

    @Test
    public void negativeNumberPowerNegativeOddNumber() {
        assertEquals(-0.0013717421124828531, ExponentFunction.power(-9, -3));
    }
}