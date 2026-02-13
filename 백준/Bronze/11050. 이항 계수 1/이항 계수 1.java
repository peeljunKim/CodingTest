import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        System.out.println(calculate(N, K));
    }

    /**
     * 이항 계수 계산 메서드
     */
    public static int calculate(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return calculate(n - 1, k - 1) + calculate(n - 1, k);
    }
}