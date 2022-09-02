package Calculators;

import com.sharpness.Calculators.OneOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneOperatorTest {

    @Test
    void oneOperator() {
        OneOperator calculator = new OneOperator();
        assertEquals(32, calculator.evaluate("2+30"));
        assertEquals(6, calculator.evaluate("2 * 3"));
        assertEquals(-1, calculator.evaluate("2 -3"));
        assertEquals(0.6666666666666666, calculator.evaluate("2 / 3"));
    }
}