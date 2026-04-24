import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" "); // 각 사람의 인출 시간
        int[] P = new int[N];  // 
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(P); // 시간이 적게 걸리는 사람부터 다시 줄을 세우기 위해 정렬

        int totalSum = 0;   // 전체 대기 시간의 합
        int currentSum = 0; // 현재 순서의 사람이 마칠 때까지 걸린 시간

        for (int i = 0; i < N; i++) {
            currentSum += P[i];
            totalSum += currentSum;
        }

        System.out.println(totalSum);
        br.close();
    }
}