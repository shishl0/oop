package practice5;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        double leftOperand, result, rightOperand;
        String leftString, operator, rightString;
        StringTokenizer tokenizer;
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String[] expressions = input.split("\\s+");

        for (String expr : expressions) {
            if (expr.isEmpty()) continue;

            tokenizer = new StringTokenizer(expr, "+-*/", true);

            try {
                leftString = tokenizer.nextToken();
                operator = tokenizer.nextToken();
                rightString = tokenizer.nextToken();

                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException e) {
                    System.out.println("Left operand is not a number");
                    continue;
                }

                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException e) {
                    System.out.println("Right operand is not a number");
                    continue;
                }

                switch (operator) {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                    case "/":
                        result = leftOperand / rightOperand;
                        break;
                    default:
                        System.out.println("Invalid operator: " + operator);
                        continue;
                }

                System.out.println("Result: " + result);
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax");
            }
        }

    }
}
