import java.io.*;

public class Main {
    // 조합 계산 결과
    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            sb.append(combination(m, n)).append('\n');
        }
        
        System.out.println(sb.toString());
    }

    /**
     * 재귀 함수
     * nCr = n-1Cr-1 + n-1Cr
     */
    static int combination(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        // n개 중 n개를 뽑거나, 0개를 뽑는 경우
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}