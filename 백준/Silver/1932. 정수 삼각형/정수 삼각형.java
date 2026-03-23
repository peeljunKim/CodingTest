import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] triangle = new int[n][n]; // 삼각형

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < row.length; j++) {
                triangle[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 맨 아래에서 두 번째 줄부터 위로
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // 내 바로 아래 왼쪽(i+1, j)과 오른쪽(i+1, j+1) 중 큰 값을 골라 현재 칸에 더함
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        System.out.println(triangle[0][0]);
        br.close();
    }
}