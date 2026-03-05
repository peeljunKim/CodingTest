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

        dfs(1, 0);

        System.out.print(sb.toString());
        br.close();
    }

    /**
     * @param start 현재 탐색을 시작할 숫자
     * @param depth 현재 수열에 채워진 숫자의 개수
     */
    static void dfs(int start, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            // 중복 허용을 위해 다음 재귀에도 현재 숫자 i를 포함할 수 있도록 함
            dfs(i, depth + 1);
        }
    }
}