import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 배열의 크기
        int[] A = new int[N]; // 첫번째 배열
        int[] B = new int[N]; // 두번째 배열

        String[] inputA = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(inputA[i]);
        }

        String[] inputB = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(inputB[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int num = 0;
        for (int i = 0; i < N; i++) {
            // 가장 작은 값과 가장 큰 값을 곱해야 전체 합이 최소가 됨
            // 그래서 B 배열은 역방향으로 접근
            num += A[i] * B[N - 1 - i];
        }

        System.out.println(num);
        br.close();
    }
}