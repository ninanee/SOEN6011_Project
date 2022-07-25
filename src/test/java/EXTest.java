/**
 * Author: Yun Ni
 * Student ID: 40179775
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EXTest {

    @Test
    void ePowerZero() {
        assertEquals(1,ExponentFunction.ex(ExponentFunction.E,0));
    }

    @Test
    void ePowerPositive() {
        assertEquals(22026.46579480671,ExponentFunction.ex(10,ExponentFunction.EXPANSION));
    }

    @Test
    void ePowerNegative() {
        assertEquals(4.539992943405228E-5,ExponentFunction.ex(-10,ExponentFunction.EXPANSION));
    }

    @Test
    void ePowerRealNumber() {
        assertEquals(15.154234532556728,ExponentFunction.ex(2.71828,ExponentFunction.EXPANSION));
    }
}