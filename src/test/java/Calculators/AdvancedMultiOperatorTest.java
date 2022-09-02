package Calculators;

import com.sharpness.Calculators.AdvancedMultiOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedMultiOperatorTest {
    AdvancedMultiOperator calculator = new AdvancedMultiOperator();

    @Test
    void evaluate() {
        assertEquals(122, calculator.evaluate("2+3*40"));
        assertEquals(10, calculator.evaluate("2 * 3 + 4"));
        assertEquals(3.666666666666667, calculator.evaluate("2 / 3 + 4 - 1"));
        assertEquals(-10, calculator.evaluate("2 - 3 * 4"));
    }
}