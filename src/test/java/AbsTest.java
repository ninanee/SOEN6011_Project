/**
 * Author: Yun Ni
 * Student ID: 40179775
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AbsTest {

    @Test
    void absZero() {

        assertEquals(0, ExponentFunction.abs(0));
        assertEquals(0, ExponentFunction.abs(-0));
    }

    @Test
    void absPositive() {
        assertEquals(5, ExponentFunction.abs(5));
        assertEquals(18, ExponentFunction.abs(18));
        assertEquals(Integer.MAX_VALUE, ExponentFunction.abs(Integer.MAX_VALUE));
    }

    @Test
    void absNegative() {
        assertEquals(1, ExponentFunction.abs(-1));
        assertEquals(5, ExponentFunction.abs(-5));
        assertEquals(10.89, ExponentFunction.abs(-10.89));
        assertEquals(Integer.MAX_VALUE, ExponentFunction.abs(-Integer.MAX_VALUE));
    }
}