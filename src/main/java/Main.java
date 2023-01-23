import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(Solution.isValid(s));

    }

    public static class Solution {

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else if (!stack.isEmpty()) {
                    if (s.charAt(i) == ')' && stack.peek() == '(' && !stack.isEmpty()) {
                        stack.pop();
                    } else if (s.charAt(i) == '}' && stack.peek() == '{' && !stack.isEmpty()) {
                        stack.pop();
                    } else if (s.charAt(i) == ']' && stack.peek() == '[' && !stack.isEmpty()) {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                } else {
                    return false;
                }
            }
            return stack.isEmpty();
        }

    }
}
