import java.io.*;

public class Main {
    static int N, M;
    static int[] arr; 
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
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
     * @param start 탐색을 시작할 숫자
     * @param depth 현재 수열에 담긴 숫자의 개수
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
            dfs(i + 1, depth + 1); // 다음 숫자는 현재 숫자 i보다 큰 i+1부터 탐색
        }
    }
}