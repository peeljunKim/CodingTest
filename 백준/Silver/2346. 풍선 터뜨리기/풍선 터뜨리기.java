import java.util.*;
import java.io.*;

// 결과 값이 풍선 번호를 출력, 순서가 아님
public class Main {
    static class Balloon {
        int index;
        int value;

        Balloon(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            deque.add(new Balloon(i + 1, Integer.parseInt(input[i])));
        }

        while (!deque.isEmpty()) {
            Balloon current = deque.pollFirst(); // 맨 앞에 풍선
            sb.append(current.index).append(" ");

            if (deque.isEmpty()) {
                break;
            }

            int move = current.value; // 

            // 오른쪽으로 이동, 이미 하나를 터뜨렸으므로 (move - 1)번만큼 회전
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else { // 절댓값만큼 왼쪽으로 이동, 
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString());
    }
}