package com.sharpness.util;

import java.util.List;

public class MathLogic {

    public static double simpleLogic(double param1, double param2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = param1 + param2;
                break;
            case '-':
                result = param1 - param2;
                break;
            case '*':
                result = param1 * param2;
                break;
            case '/':
                result = param1 / param2;
                break;
            default:
                System.out.println("Invalid operator..");
                break;
        }
        return result;
    }

    public static double advancedLogic(List<String> exprList) {
        boolean shouldReplace = false;
        int operatorIndex = 1;

        while (exprList.contains("*") ||
                (exprList.contains("/")) ||
                (exprList.contains("+")) ||
                (exprList.contains("-"))) {

            double tempNumberOne = Double.parseDouble(exprList.get(operatorIndex - 1));
            double tempNumberTwo = Double.parseDouble(exprList.get(operatorIndex + 1));

            if (exprList.contains("*")) {
                if (exprList.get(operatorIndex).equals("*")) {
                    exprList.set(operatorIndex + 1, (tempNumberOne * tempNumberTwo) + "");
                    shouldReplace = true;
                }
            } else if (exprList.contains("/")) {
                if (exprList.get(operatorIndex).equals("/")) {
                    exprList.set(operatorIndex + 1, (tempNumberOne / tempNumberTwo) + "");
                    shouldReplace = true;
                }
            } else if (exprList.contains("+")) {
                if (exprList.get(operatorIndex).equals("+")) {
                    exprList.set(operatorIndex + 1, (tempNumberOne + tempNumberTwo) + "");
                    shouldReplace = true;
                }
            } else if (exprList.contains("-")) {
                if (exprList.get(operatorIndex).equals("-")) {
                    exprList.set(operatorIndex + 1, (tempNumberOne - tempNumberTwo) + "");
                    shouldReplace = true;
                }
            }
            if (shouldReplace) {
                exprList.remove(operatorIndex - 1);
                exprList.remove(operatorIndex - 1);
            } else {
                operatorIndex = operatorIndex + 2;
            } if (operatorIndex >= exprList.size()) {
                operatorIndex = 1;
            }


        }
        return Double.parseDouble(exprList.get(0));
    }

}
