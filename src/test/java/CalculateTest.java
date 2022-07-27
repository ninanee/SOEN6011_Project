/**
 * Author: Yun Ni
 * Student ID: 40179775
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void integerCalculate() throws Exception {
        assertEquals(295245, ExponentFunction.calculate(5, 3, 10), 1);
        assertEquals(1, ExponentFunction.calculate(1, 3, 0), 1);
    }

    @Test
    void positiveCalculate() throws Exception {
        assertEquals(38.0649924009, ExponentFunction.calculate(2, 3.6, 2.3), 1);
        assertEquals(8.36526215004, ExponentFunction.calculate(6.3, 1.2, 1.3), 1);
    }

    @Test
    void negativeCalculate() throws Exception {
        assertEquals(0.10508343093, ExponentFunction.calculate(2, 3.6, -2.3), 1);
        assertEquals(5.20724864549, ExponentFunction.calculate(6.3, 1.2, -1.3), 1);
    }

    @Test
    void exceptionCalculate() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            System.out.println(ExponentFunction.calculate(0, 2, 2));
        });

        assertTrue(exception.getMessage().contains("variable a should not be 0"));
    }

}