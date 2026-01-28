import java.io.*;
import java.util.*;

// 비슷한 문제 있었음
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str == null || str.equals(".")) {
                break;
            }

            sb.append(match(str)).append("\n");
        }
        
        System.out.print(sb.toString());
    }

    public static String match(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }
                
                stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }
                
                stack.pop();
            }
        }

        return stack.isEmpty() ? "yes" : "no";
    }
}