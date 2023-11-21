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

        if (buttonText.compareTo("C") == 0) {
            result = "";
        } else if (buttonText.compareTo("_") == 0) {
            result = labelText + " ";
        } else if (buttonText.compareTo("<") == 0) {
            result = deleteLastSymbol(labelText);
        } else if (buttonText.compareTo("=") == 0) {
            result = calculation(model, labelText);
        } else {
            result = labelText + buttonText + " ";
        }
        return result;
    }
    public static String calculation(CalcModel model, String expression) {
        model.clearStack();
        String[] items = expression.split(" ");
        String result = "";

        for (String item : items) {
            if (item.isEmpty()) {
                continue;
            }
            if (isInteger(item)) {
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
