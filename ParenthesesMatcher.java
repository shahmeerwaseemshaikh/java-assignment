/*
        JAVA ASSIGNMENT
        SHAHMEER WASEEM SHAIKH
        2K24/CSE/138
*/

import java.util.Stack;

public class ParenthesesMatcher {

    // Method to check if the parentheses are balanced
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // Push opening brackets to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Check matching closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched pair
                }
            }
        }

        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";        // Balanced
        String test2 = "{[(])}";        // Not balanced
        String test3 = "((()))";        // Balanced
        String test4 = "((())";         // Not balanced

        System.out.println(test1 + " => " + areParenthesesBalanced(test1));
        System.out.println(test2 + " => " + areParenthesesBalanced(test2));
        System.out.println(test3 + " => " + areParenthesesBalanced(test3));
        System.out.println(test4 + " => " + areParenthesesBalanced(test4));
    }
}

/* OUTPUT
{[()]} => true
{[(])} => false
((())) => true
((()) => false*/
