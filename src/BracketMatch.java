import datastructures.Stack;

public class BracketMatch {
    private static void check(String s) {
        Stack stack = new Stack();
        char c;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                c = (char)stack.pop();
                if (c != '(') {
                    System.out.println(false);
                    return;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                c = (char)stack.pop();
                if (c != '[') {
                    System.out.println(false);
                    return;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (!stack.isEmpty()) System.out.println(false);
        if (stack.isEmpty()) System.out.println(true);
    }

    public static void main(String[] args) {
        check("([])");
        check("([)]");
        check("([]");
        check("([]))");
    }
}
