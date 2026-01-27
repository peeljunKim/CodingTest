import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(validPs(br.readLine())).append("\n");
        }
        
        System.out.print(sb.toString());
    }

    public static String validPs(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } 
            else if (stack.isEmpty()) {  // 닫는 괄호인 경우
                return "NO";
            } else {  // 비어있지 않다면 짝이 맞으므로 하나 꺼냄
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}