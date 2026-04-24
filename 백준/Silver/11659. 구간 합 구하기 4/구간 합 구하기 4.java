import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        long[] prefixSum = new long[N + 1]; // 누적 합 배열 (1번 인덱스부터 사용하기 위해 +1)
        String[] numStrings = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        // 두 번째 줄: N개의 숫자 입력
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + Integer.parseInt(numStrings[i - 1]);
        }

        
        // M번의 구간 합 질문 처리
        for (int k = 0; k < M; k++) {
            String[] range = br.readLine().split(" ");
            int i = Integer.parseInt(range[0]);
            int j = Integer.parseInt(range[1]);

            // i ~ j의 합 = S[j] - S[i-1]
            sb.append(prefixSum[j] - prefixSum[i - 1]).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}