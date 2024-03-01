package DSAApna;


import java.util.*;

public class EvaluationOfPostFix {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String expression = "231*+9-";
        for (int i = 0; i < expression.length(); i++) {
            expression.charAt(i);
            if (Character.isDigit(expression.charAt(i))) {
                stack.push(expression.charAt(i)-'0');
                System.err.println(Integer.valueOf(expression.charAt(i)));
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                switch (expression.charAt(i)) {
                    case '+' :
                        stack.push(operand2 + operand1);
                        break;
                    case '-' :  
                        stack.push(operand2 - operand1);
                        break;
                    case '*':
                        stack.push(operand2 * operand1);
                        break;
                    case '/':
                        stack.push(operand2 / operand1);
                        break;
                }
            }
        }
        System.out.println(stack.peek()); // prints the final result
    }
}
