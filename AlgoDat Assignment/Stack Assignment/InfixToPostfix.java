public class InfixToPostfix {
    public static String convert(String infix) {
        if (infix == null || infix.trim().isEmpty()) {
            throw new IllegalArgumentException("Ekspresi tidak boleh kosong");
        }

        Stack operators = new Stack();
        StringBuilder postfix = new StringBuilder();
        boolean needsOperand = true;

        int i = 0;
        while (i < infix.length()) {
            char current = infix.charAt(i);

            if (Character.isWhitespace(current)) {
                i++;
                continue;
            }

            if (isOperand(current)) {
                if (!needsOperand) throw new IllegalArgumentException("Operator tidak ditemukan");
                int start = i++;
                while (i < infix.length() && isOperand(infix.charAt(i))) {
                    i++;
                }
                append(postfix, infix.substring(start, i));
                needsOperand = false;
                continue;
            }

            if (current == '(') {
                if (!needsOperand) throw new IllegalArgumentException("Operator sebelum '(' tidak ditemukan");
                operators.push("(");
                i++;
                continue;
            }

            if (current == ')') {
                if (needsOperand) throw new IllegalArgumentException("Isi atau operand sebelum ')' tidak ditemukan");
                while (!operators.isEmpty() && !operators.peek().equals("("))
                    append(postfix, operators.pop());
                if (operators.isEmpty()) throw new IllegalArgumentException("Tanda kurung tidak berpasangan");
                operators.pop();
                i++;
                continue;
            }

            if (isOperator(current)) {
                if (needsOperand) throw new IllegalArgumentException("Operand sebelum operator tidak ditemukan");
                while (!operators.isEmpty() && isOperator(operators.peek().charAt(0))
                        && shouldPop(operators.peek().charAt(0), current))
                    append(postfix, operators.pop());
                operators.push(String.valueOf(current));
                needsOperand = true;
                i++;
                continue;
            }

            throw new IllegalArgumentException("Karakter tidak dikenal: " + current);
        }

        if (needsOperand) throw new IllegalArgumentException("Ekspresi belum lengkap");
        while (!operators.isEmpty()) {
            String operator = operators.pop();
            if (operator.equals("(")) throw new IllegalArgumentException("Tanda kurung tidak berpasangan");
            append(postfix, operator);
        }
        return postfix.toString();
    }

    private static boolean isOperand(char value) {
        return Character.isLetterOrDigit(value) || value == '_';
    }

    private static boolean isOperator(char value) {
        return "+-*/%^".indexOf(value) >= 0;
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') return 1;
        if (operator == '*' || operator == '/' || operator == '%') return 2;
        if (operator == '^') return 3;
        return 0;
    }

    private static boolean shouldPop(char top, char current) {
        return precedence(top) > precedence(current)
                || (precedence(top) == precedence(current) && current != '^');
    }

    private static void append(StringBuilder output, String token) {
        if (output.length() > 0) output.append(' ');
        output.append(token);
    }
}
