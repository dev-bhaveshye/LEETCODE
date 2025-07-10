package LEETCODE;

import java.util.Stack;

public class DecodeString_394 {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int num = 0;
                while (ch >= '0' && ch <= '9') {
                    num = num * 10 + ch - '0';
                    i++;
                    ch = s.charAt(i);
                }
                countStack.push(num);
                i--; // Adjust for the increment in the while loop
                ch= s.charAt(i);
            } else if (s.charAt(i) != ']') {
                stringStack.push(ch + "");
            } else if (s.charAt(i) == ']') {
                String currentString = new String();
                while (!stringStack.peek().equals("[")) {
                    currentString = stringStack.pop() + currentString;
                }
                stringStack.pop();
                int repeatCount = countStack.pop();
                StringBuilder repeatedString = new StringBuilder();
                while (repeatCount > 0) {
                    repeatedString.append(currentString);
                    repeatCount--;
                }
                stringStack.push(repeatedString.toString());
            }

        }
        StringBuilder result = new StringBuilder();
        while (!stringStack.isEmpty()) {
            result.insert(0, stringStack.pop());
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String s = "100[leetcode]";
        System.out.println(decodeString(s)); // Output: "accaccacc"
    }
}
