public class InfixToPostfix {
    public static String convert(String infix) {
        if (infix == null || infix.trim().isEmpty()) {
            throw new IllegalArgumentException("Infix expression must not be empty");
        }

        Stack operators = new Stack();
        StringBuilder postfix = new StringBuilder();
        boolean expectOperand = true;
        int index = 0;

        while (index < infix.length()) {
            char current = infix.charAt(index);

            if (Character.isWhitespace(current)) {
                index++;
                continue;
            }

            if (Character.isLetterOrDigit(current) || current == '_') {
                if (!expectOperand) {
                    throw new IllegalArgumentException("Missing operator in infix expression");
                }

                int start = index++;
                while (index < infix.length()) {
                    char next = infix.charAt(index);
                    if (!Character.isLetterOrDigit(next) && next != '_') {
                        break;
                    }
                    index++;
                }
                appendToken(postfix, infix.substring(start, index));
                expectOperand = false;
                continue;
            }

            if (current == '(') {
                if (!expectOperand) {
                    throw new IllegalArgumentException("Missing operator before '('");
                }
                operators.push(String.valueOf(current));
                index++;
                continue;
            }

            if (current == ')') {
                if (expectOperand) {
                    throw new IllegalArgumentException("Unexpected ')'");
                }
                while (!operators.isEmpty() && !operators.peek().equals("(")) {
                    appendToken(postfix, operators.pop());
                }
                if (operators.isEmpty()) {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
                operators.pop();
                expectOperand = false;
                index++;
                continue;
            }

            if (isOperator(current)) {
                if (expectOperand) {
                    throw new IllegalArgumentException("Operator is missing a left operand");
                }

                String operator = String.valueOf(current);
                while (!operators.isEmpty() && isOperator(operators.peek().charAt(0))
                        && shouldPop(operators.peek().charAt(0), current)) {
                    appendToken(postfix, operators.pop());
                }
                operators.push(operator);
                expectOperand = true;
                index++;
                continue;
            }

            throw new IllegalArgumentException("Unsupported character: " + current);
        }

        if (expectOperand) {
            throw new IllegalArgumentException("Expression ends with an operator or is incomplete");
        }

        while (!operators.isEmpty()) {
            String operator = operators.pop();
            if (operator.equals("(")) {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            appendToken(postfix, operator);
        }

        return postfix.toString();
    }

    private static boolean isOperator(char value) {
        return value == '+' || value == '-' || value == '*' || value == '/'
                || value == '%' || value == '^';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    private static boolean shouldPop(char stackOperator, char currentOperator) {
        if (currentOperator == '^') {
            return precedence(stackOperator) > precedence(currentOperator);
        }
        return precedence(stackOperator) >= precedence(currentOperator);
    }

    private static void appendToken(StringBuilder output, String token) {
        if (output.length() > 0) {
            output.append(' ');
        }
        output.append(token);
    }
}
