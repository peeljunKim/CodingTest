import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 수열의 크기
        int[] arr = new int[n]; 
        int[] dp = new int[n]; // i번째 숫자를 마지막으로 하는 최대 연속 합

        // 데이터 입력
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        dp[0] = arr[0];
        int max = arr[0];

        // 첫 번째 숫자는 위에 저장했으니 두 번째 숫자부터 끝까지 탐색
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
        br.close();
    }
}