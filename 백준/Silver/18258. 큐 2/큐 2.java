import java.io.*;
import java.util.*;

// push / pop / size / empty / front / back
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            
            switch (command) {
                case "push":
                    int x = Integer.parseInt(input[1]);
                    queue.offer(x);
                    break;
                    
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                    
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                    
                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                    
                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peekFirst()).append("\n");
                    }
                    break;
                    
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peekLast()).append("\n");
                    }
                    break;
                default:
                    System.out.println("출력되면 안됨");
            }
        }
        
        System.out.print(sb.toString());
    }
}