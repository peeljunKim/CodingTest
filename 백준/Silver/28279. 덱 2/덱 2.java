import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String str = input[0];
            
            switch (str) {
                case "1": // 앞에 삽입
                    deque.addFirst(Integer.parseInt(input[1]));
                    break;
                case "2": // 뒤에 삽입
                    deque.addLast(Integer.parseInt(input[1]));
                    break;
                case "3": // 맨 앞 제거 후 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case "4": // 맨 뒤 제거 후 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case "5": // 크기 출력
                    sb.append(deque.size()).append("\n");
                    break;
                case "6": // 비어있는지 여부
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "7": // 맨 앞 조회
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case "8": // 맨 뒤 조회
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
               default:
                    break;
            }
        }
        
        System.out.print(sb.toString());
    }
}