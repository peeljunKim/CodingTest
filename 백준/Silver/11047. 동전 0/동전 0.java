import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        // 가장 큰 가치의 동전부터 역순으로 탐색
        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] <= K) {
                // 현재 동전으로 채울 수 있는 최대 개수를 더함
                count += (K / coins[i]);
                // 사용한 만큼의 금액을 제외하고 남은 금액 갱신
                K = K % coins[i];
            }
            
            if (K == 0) break;
        }

        System.out.println(count);
        br.close();
    }
}