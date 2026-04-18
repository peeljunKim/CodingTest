import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // 커스텀 정렬 조건을 가진 우선순위 큐 생성
        PriorityQueue<Integer> absHeap = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            // 절댓값이 같다면 실제 값 비교 (오름차순)
            if (abs1 == abs2) {
                return o1 - o2;
            }
            // 절댓값이 다르다면 절댓값 기준으로 비교 (오름차순)
            return abs1 - abs2;
        });

        
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (absHeap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(absHeap.poll()).append("\n");
                }
            } else {
                absHeap.add(x);
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}