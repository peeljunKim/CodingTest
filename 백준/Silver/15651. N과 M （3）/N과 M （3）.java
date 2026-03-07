import java.io.*;

public class Main {
    static int N, M;
    static int[] arr; 
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        arr = new int[M];

        dfs(0);

        System.out.print(sb.toString());
        br.close();
    }

    /**
     * @param depth 현재 수열에 채워진 숫자의 개수
     */
    static void dfs(int depth) {
        // M개를 모두 골랐을 때 추가
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 중복 순열이므로 매번 1부터 N까지 전체 탐색
        for (int i = 1; i <= N; i++) {
            arr[depth] = i;  // 현재 깊이에 숫자 저장
            dfs(depth + 1);  // 다음 자리 숫자 고르기
        }
    }
}