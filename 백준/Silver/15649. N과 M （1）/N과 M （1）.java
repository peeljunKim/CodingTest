import java.io.*;

public class Main {
    static int N, M;
    static int[] arr;       // 수열을 담을 배열
    static boolean[] visited; // 방문 여부를 체크할 배열
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        arr = new int[M];
        visited = new boolean[N + 1];

        dfs(0);

        System.out.print(sb.toString());
        br.close();
    }

    /**
     * @param depth 현재 수열에 담긴 숫자의 개수
     */
    static void dfs(int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;  
                arr[depth] = i;     
                dfs(depth + 1);     
                
                // 돌아오면 다시 미방문 상태로 변경
                visited[i] = false; 
            }
        }
    }
}