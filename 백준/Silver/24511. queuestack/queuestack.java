import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()); // 자료구조 개수(N)
        String[] types = br.readLine().split(" "); // 자료구조[0: 큐, 1: 스택] 수열 A
        
        String[] initials = br.readLine().split(" "); // 길이N의 수열 B
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            if (types[i].equals("0")) {
                deque.addLast(Integer.parseInt(initials[i]));
            }
        }

        int M = Integer.parseInt(br.readLine()); // 삽입할 수열의 길이
        String[] insertElements = br.readLine().split(" "); //  queuestack에 삽입할 원소 M의 수열 C

        for (int i = 0; i < M; i++) {
            int newNum = Integer.parseInt(insertElements[i]);
            
            deque.addFirst(newNum);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}