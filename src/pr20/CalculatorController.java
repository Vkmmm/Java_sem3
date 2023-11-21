package pr20;

import javax.swing.*;
import java.util.Stack;
public class CalculatorController extends JFrame {
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        CalcModel calculatorModel = new CalcModel();
        CalcDesign.createGUI(calculatorModel);
    }
    public static String buttonMethod(CalcModel model, String buttonText, String labelText) {
        String result = "";

        if (buttonText.equals("=")) {
            String infixExpression = labelText.replace("n", "-").replace("_", "").trim();
            try {
                String postfixExpression = infixToPostfix(infixExpression);
                String[] expressionTokens = postfixExpression.split(" ");
                result = calculation(model, expressionTokens);
            } catch (IllegalArgumentException e) {
                result = "Error: Invalid expression";
            }
        } else if (buttonText.matches("[0-9.]")) {
            result = labelText + buttonText;
        } else if (buttonText.matches("[/*+-]")) {
            result = labelText + " " + buttonText.replace("n", "-") + " ";
        }

        return result;
    }
    private static String infixToPostfix(String infix) {
        Stack<Character> operatorStack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        String[] tokens = infix.split(" ");

        for (String token : tokens) {
            if (token.matches("[0-9.]+")) {
                postfix.append(token).append(" ");
            } else if (token.matches("[/*+\\-]")) {
                char operator = token.charAt(0);
                while (!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(operator)) {
                    postfix.append(operatorStack.pop()).append(" ");
                }
                operatorStack.push(operator);
            } else if (token.equals("(")) {
                operatorStack.push('(');
            } else if (token.equals(")")) {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop()).append(" ");
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                }
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop()).append(" ");
        }

        return postfix.toString().trim();
    }
    private static int getPrecedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }


    public static String calculation(CalcModel model, String[] items) {
        model.clearStack();
        String result = "";
        for (String item : items) {
            if (item.compareTo("end") == 0)
                break;
            else if (isInteger(item)) {
                model.eventTick(Integer.parseInt(item));
            } else if (isDouble(item)) {
                model.eventTick(Double.parseDouble(item));
            } else {
                try {
                    model.eventTick(item.charAt(0));
                } catch (RuntimeException e) {
                }
            }
        }
        return model.toString();
    }

    public static String deleteLastSymbol(String s) {
        String ns = "";
        for (int i = 0; i < s.length() - 1; i++) {
            ns += s.charAt(i);
        }
        return ns;
    }
}