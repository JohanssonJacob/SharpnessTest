package com.sharpness.Calculators;

import com.sharpness.util.MathLogic;
import com.sharpness.util.StringHandler;

import java.util.Arrays;
import java.util.List;

public class SimpleMultiOperator {

    public double evaluate(String expression) {
        double result = 0;
        List<String> expressionList = Arrays.asList(StringHandler.parseExpression(expression));
        if (isOperatorCombinationsValid(expressionList)) {
            double firstExpression = calculateFirstExpression(expressionList);
            result = calculateNextExpression(expressionList, firstExpression);
        } else {
            System.out.println("Incompatible operators...");
        }
        return result;
    }

    public double calculateFirstExpression(List<String> expressionList) {
        return MathLogic.simpleLogic(Double.parseDouble(expressionList.get(0)), Double.parseDouble(expressionList.get(2)), expressionList.get(1).charAt(0));
    }

    public double calculateNextExpression(List<String> expressionList, double firstExpression) {
        double result = 0;
        double tempValue = firstExpression;
        for (int i = 3; i < expressionList.size(); i+=2) {
            char tempOperator = expressionList.get(i).charAt(0);
            double tempParam = Double.parseDouble(expressionList.get(i+1));
            tempValue = MathLogic.simpleLogic(tempValue,tempParam, tempOperator);
            result = tempValue;
        }

        return result;
    }

    public boolean isOperatorCombinationsValid(List<String> expressionList) {
        char firstOperator = expressionList.get(1).charAt(0);
        boolean isValid = true;
        for (int i = 3; i < expressionList.size(); i++) {
            if (firstOperator == '+' || firstOperator == '-') {
                if (expressionList.get(i).charAt(0) == '*' || expressionList.get(i).charAt(0) == '/') {
                    isValid = false;
                }
            } else if (firstOperator == '*' || firstOperator == '/') {
                if (expressionList.get(i).charAt(0) == '+' || expressionList.get(i).charAt(0) == '-') {
                    isValid = false;
                }
            }
        }

        return isValid;
    }
}
