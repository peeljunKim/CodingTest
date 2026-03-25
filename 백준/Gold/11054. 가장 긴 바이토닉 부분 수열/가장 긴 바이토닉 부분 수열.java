import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] up = new int[N]; // 정방향
        int[] down = new int[N]; // 역방향

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // 왼쪽에서 오른쪽으로 가는 LIS 구하기
        for (int i = 0; i < N; i++) {
            up[i] = 1; // 최소 길이는 1 (자기 자신)
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    up[i] = Math.max(up[i], up[j] + 1);
                }
            }
        }

        // 오른쪽에서 왼쪽으로 오는 LIS(감소하는 부분) 구하기
        for (int i = N - 1; i >= 0; i--) {
            down[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    down[i] = Math.max(down[i], down[j] + 1);
                }
            }
        }

        // 두 결과 합치기
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, up[i] + down[i] - 1);
        }

        System.out.println(max);
        br.close();
    }
}