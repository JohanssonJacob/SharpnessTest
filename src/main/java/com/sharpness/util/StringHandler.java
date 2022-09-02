package com.sharpness.util;

import java.util.ArrayList;
import java.util.List;

public class StringHandler {

    public static String[] parseExpression(String expression) {
        expression = expression.replaceAll(" ","");
        List<String> expressionList = new ArrayList<>();
        StringBuilder currentNumber = new StringBuilder();

        for (char ch: expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber.append(ch);
            } else {
                if (currentNumber.length() > 0) {
                    expressionList.add(currentNumber.toString());
                    currentNumber = new StringBuilder();
                }
                expressionList.add(String.valueOf(ch));
            }
        }
        if (currentNumber.length() > 0)
            expressionList.add(currentNumber.toString());

        return expressionList.toArray(new String[expressionList.size()]);
    }

}
