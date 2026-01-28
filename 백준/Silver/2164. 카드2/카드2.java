import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        
        int N = Integer.parseInt(br.readLine());
        
        
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        
        while (queue.size() > 1) {
            queue.poll();
            
            // 가장 앞에 있는 것을 뽑아서 다시 뒤로 추가
            if (!queue.isEmpty()) {
                queue.add(queue.poll());
            }
        }
        
        System.out.println(queue.peek());
    }
}