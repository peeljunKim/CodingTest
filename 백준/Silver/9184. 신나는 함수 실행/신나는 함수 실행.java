import java.io.*;

public class Main {
    static int[][][] memo = new int[21][21][21]; // 0 ~ 20

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            // 종료 조건: -1 -1 -1
            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ")
              .append(w(a, b, c)).append("\n");
        }
        
        System.out.print(sb.toString());
        br.close();
    }

    static int w(int a, int b, int c) {
        // a, b, c가 0 이하인 경우 (인덱스 범위 밖이므로 메모 확인 전 처리)
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        // a, b, c가 20을 초과하는 경우
        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }

        // 이미 계산된 값이 메모리에 있는지 확인
        if (memo[a][b][c] != 0) {
            return memo[a][b][c];
        }

        // 값이 없다면 문제의 조건에 따라 계산하여 메모리에 저장
        if (a < b && b < c) {
            memo[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            memo[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }

        return memo[a][b][c];
    }
}