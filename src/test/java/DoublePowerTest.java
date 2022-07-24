import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublePowerTest {

    @Test
    public void zeroPowerZero() throws Exception {
        assertEquals(1.0, ExponentFunction.power(0.0, 0.0));
    }

    @Test
    public void zeroPowerRationalNumber() {
        assertEquals(0.0, ExponentFunction.power(0.0, 5/6));
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

    // Fix this
    @Test
    public void negativeNumberPowerNegativeNumber() throws Exception {
        assertEquals(-5.12E-7, ExponentFunction.power(-5.5, -9.6));
    }

    @Test
    public void negativeNumberPowerPositiveEvenNumber() throws Exception {
        assertEquals(81, ExponentFunction.power(-30.7, 41.3));
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