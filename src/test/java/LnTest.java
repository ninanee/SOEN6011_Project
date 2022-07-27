/**
 * Author: Yun Ni
 * Student ID: 40179775
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LnTest {

    @Test
    void lnZero() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            System.out.println(ExponentFunction.ln(0));
        });

        assertTrue(exception.getMessage().contains("The range of the math has errors"));
    }

    @Test
    void lnOfPositiveValues() throws Exception {

        assertEquals(0, ExponentFunction.ln(1));
        assertEquals(3.9702919135520522, ExponentFunction.ln(53));
        assertEquals(4.9126548857360515, ExponentFunction.ln(136));
    }

    @Test
    void lnOfNegativeValues() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            ExponentFunction.ln(-2);
        });

        assertTrue(exception.getMessage().contains("The range of the math has errors"));

    }

}