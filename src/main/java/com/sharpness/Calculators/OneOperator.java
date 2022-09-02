package com.sharpness.Calculators;

import com.sharpness.util.MathLogic;
import com.sharpness.util.StringHandler;

import java.util.Arrays;
import java.util.List;

public class OneOperator {

    public double evaluate(String expression) {
        List<String> expressionList = Arrays.asList(StringHandler.parseExpression(expression));
        double param1 = Double.parseDouble(expressionList.get(0));
        double param2 = Double.parseDouble(expressionList.get(2));
        char operator = expressionList.get(1).charAt(0);
        return MathLogic.simpleLogic(param1,param2,operator);
    }
}
