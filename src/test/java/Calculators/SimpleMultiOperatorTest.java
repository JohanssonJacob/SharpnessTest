package Calculators;

import com.sharpness.Calculators.SimpleMultiOperator;
import com.sharpness.util.StringHandler;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMultiOperatorTest {

    SimpleMultiOperator calculator = new SimpleMultiOperator();
    List<String> mockExpressions = List.of(StringHandler.parseExpression("1 + 2 + 3 + 4 + 5 + 6"));
    List<String> mockExpressionsIncompatible = List.of(StringHandler.parseExpression("1 / 2 - 3 + 4 * 5 + 6"));

    @Test
    void evaluate() {
        assertEquals(36, calculator.evaluate("2+30+4"));
        assertEquals(18, calculator.evaluate("2 - 3 + 4 + 15"));
        assertEquals(24, calculator.evaluate("2 * 3 * 4"));
        assertEquals(30, calculator.evaluate("2 * 3 / 4 * 20"));
    }

    @Test
    void calculateFirstExpression() {
        assertEquals(3, calculator.calculateFirstExpression(mockExpressions));
    }

    @Test
    void calculateNextExpression() {
        assertEquals(21, calculator.calculateNextExpression(mockExpressions, 3));
    }

    @Test
    void isOperatorCombinationsValid() {
        assertFalse(calculator.isOperatorCombinationsValid(mockExpressionsIncompatible));
    }
}