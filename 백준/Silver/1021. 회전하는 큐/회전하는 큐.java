import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        String[] secondLine = br.readLine().split(" ");
        int[] targets = new int[M];
        
        for (int i = 0; i < M; i++) {
            targets[i] = Integer.parseInt(secondLine[i]);
        }

        int totalCount = 0; 

        for (int i = 0; i < M; i++) {
            int target = targets[i];
            
            int targetIdx = deque.indexOf(target);
            int size = deque.size();
            
            int halfIdx = size / 2; 

            if (size % 2 == 0 && targetIdx == halfIdx) {
                halfIdx -= 1; 
            }

            // 왼쪽으로 이동 (앞의 원소를 뒤로 보냄) - 2번 연산
            if (targetIdx <= halfIdx) {
                for (int j = 0; j < targetIdx; j++) {
                    deque.addLast(deque.pollFirst()); 
                    totalCount++;
                }
            } 
            // 오른쪽으로 이동 (뒤의 원소를 앞으로 보냄) - 3번 연산
            else {
                for (int j = 0; j < size - targetIdx; j++) {
                    deque.addFirst(deque.pollLast());
                    totalCount++;
                }
            }

            // 연산 후 맨 앞에 도달한 원소를 제거 (1번 연산)
            deque.pollFirst();
        }

        System.out.println(totalCount);
    }
}