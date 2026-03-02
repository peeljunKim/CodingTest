import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0; // 총 이동 횟수 카운트

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        // 하노이의 탑 재귀 수행 (1번에서 3번으로 실행 두번을 걸쳐서)
        hanoi(N, 1, 2, 3);

        System.out.println(count);
        System.out.print(sb.toString());
        
        br.close();
    }

    /**
     * @param n     원판의 개수
     * @param start 출발지 기둥 번호
     * @param mid   경유지 기둥 번호
     * @param end   목적지 기둥 번호
     */
    static void hanoi(int n, int start, int mid, int end) {
        // 원판이 하나도 없으면 종료
        if (n == 0) return;

        count++; 

        // n-1개를 출발지에서 경유지로 옮김 (목적지를 경유지로 활용)
        hanoi(n - 1, start, end, mid);

        // 가장 큰 원판을 출발지에서 목적지로 옮김
        sb.append(start).append(" ").append(end).append("\n");

        // 경유지에 있던 n-1개를 목적지로 옮김)
        hanoi(n - 1, mid, start, end);
    }
}