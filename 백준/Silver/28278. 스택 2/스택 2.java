import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String str = input[0];

            switch (str) {
                case "1":
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case "2":
                    if (stack.isEmpty()) sb.append("-1\n");
                    else sb.append(stack.pop()).append("\n");
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    sb.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case "5":
                    if (stack.isEmpty()) sb.append("-1\n");
                    else sb.append(stack.peek()).append("\n");
                    
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}