package Stack;

import java.util.*;

public class InfixToPostFix {

    public static int precedence(char ch) {
        if (ch == '^')
            return 3;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '+' || ch == '-')
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);
        sc.close();
    }
}
