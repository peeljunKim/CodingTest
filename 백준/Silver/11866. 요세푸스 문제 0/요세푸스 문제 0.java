import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        sb.append("<");

        while (!queue.isEmpty()) {
            // 뒤로 보내기
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }

            // 사람 제거
            sb.append(queue.poll());

            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}