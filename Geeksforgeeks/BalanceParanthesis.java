import java.util.Stack;

public class BalanceParanthesis {

    Stack<Character> stack = new Stack<>();
    boolean isBalanced = true;

    public void balancepra(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if (stack.isEmpty()) {
                isBalanced = false;
            }
            if (c == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
            if (c == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
            if (c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            isBalanced = false;
        }
        if (isBalanced == false) {
            System.out.println("NotBalanced");
        } else {
            System.out.println("Balanced");
        }
    }

    public static void main(String[] args) {
        String s = "{}{}{[}";
        BalanceParanthesis bal = new BalanceParanthesis();
        bal.balancepra(s);

    }
}
