package problemsolving;


import java.util.Stack;

class ReverseStringParenthesis {
    public String reverseSubstrings(String inputStr) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder(inputStr);

        for (int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                int start = stack.pop();
                reverseSubstring(result, start + 1, i - 1);
            }
        }
        return result.toString();
    }

    private void reverseSubstring(StringBuilder inputStr, int start, int end) {
        while (start < end) {
            char temp = inputStr.charAt(start);
            inputStr.setCharAt(start, inputStr.charAt(end));
            inputStr.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
