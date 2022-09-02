package com.sharpness.Calculators;

import com.sharpness.util.MathLogic;
import com.sharpness.util.StringHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedMultiOperator {

    public double evaluate(String expression) {
        List<String> expressionList = new ArrayList<>(Arrays.asList(StringHandler.parseExpression(expression)));
        return MathLogic.advancedLogic(expressionList);
    }
}
