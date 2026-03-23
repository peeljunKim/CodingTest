import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        // dp[i][0]: 빨강, dp[i][1]: 초록, dp[i][2]: 파랑
        int[][] dp = new int[N][3]; //

        for (int i = 0; i < N; i++) {
            String[] costs = br.readLine().split(" ");
            int r = Integer.parseInt(costs[0]);
            int g = Integer.parseInt(costs[1]);
            int b = Integer.parseInt(costs[2]);

            if (i == 0) {
                dp[i][0] = r;
                dp[i][1] = g;
                dp[i][2] = b;
            } else {
                /* 
                현재 집의 색을 정할 때, 
                이전 집의 '다른 두 색상' 중 누적 비용이 더 적은 것을 선택하여 더함
                */
                
                // 현재 집이 빨강일 때 이전 집은 초록 또는 파랑 중 최소값
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r;
                
                // 현재 집이 초록일 때 이전 집은 빨강 또는 파랑 중 최소값
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g;
                
                // 현재 집이 파랑일 때 이전 집은 빨강 또는 초록 중 최소값
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b;
            }
        }

        int result = Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]));
        
        System.out.println(result);
        br.close();
    }
}