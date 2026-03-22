import java.io.*;

public class Main {
    static long[] memo = new long[101];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        padovan();

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(memo[N]).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }

    static void padovan() {
        memo[1] = 1;
        memo[2] = 1;
        memo[3] = 1;
        
        if (memo.length > 4) memo[4] = 2;
        if (memo.length > 5) memo[5] = 2;

        // 점화식 적용: P(n) = P(n-2) + P(n-3)
        for (int i = 6; i <= 100; i++) {
            memo[i] = memo[i - 2] + memo[i - 3];
        }
    }
}