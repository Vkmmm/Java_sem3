package pr20;

import java.util.Stack;

public class CalcModel {
    private Stack<Number> numberStack;
    public CalcModel() {
        numberStack = new Stack<>();
    }
    public <T extends Number> void eventTick(T t) {
        numberStack.add(t);
    }
    public void eventTick(char c) {
        Number a;
        Number b;
        if (numberStack.size() < 2)
            return;
        switch (c) {
            case '*':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(Calc.multiply(b,a));
                break;
            case '/':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(Calc.divide(b,a));
                break;
            case '+':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(Calc.sum(b,a));
                break;
            case '-':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(Calc.subtraction(b,a));
                break;
            default:
                throw new RuntimeException("Incorrect symbol detected");
        }
    }
    public void clearStack() {
        numberStack.clear();
    }

    @Override
    public String toString() {
        String result = "";
        int count = numberStack.size();
        for (Number number : numberStack) {
            result += number;
            if (count > 1) {
                result += " ";
            }
            count--;
        }
        return result;
    }
}