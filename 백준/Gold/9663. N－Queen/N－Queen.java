import java.io.*;

public class Main {
    static int N;
    static int[] board; // index는 행, value는 열
    static int count = 0; // 가능한 경우의 수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());  // 체스판 크기 N 입력
        board = new int[N];
        nQueen(0);

        System.out.println(count);
        br.close();
    }

    /**
     * @param row 현재 퀸을 놓을 행의 위치
     */
    static void nQueen(int row) {
        // 모든 행에 퀸을 다 놓았다면 성공
        if (row == N) {
            count++;
            return;
        }

        // 해당 행(row)의 0번 열부터 N-1번 열까지 퀸을 놓아봄
        for (int col = 0; col < N; col++) {
            board[row] = col;
            
            // 놓은 위치가 안전하다면 다음 행으로 진행
            if (isPossible(row)) {
                nQueen(row + 1);
            }
            // 안전하지 않다면 다음 col로 넘어가며 자연스럽게 백트래킹 발생
        }
    }

    /**
     * 현재 row에 놓은 퀸이 이전의 퀸들과 충돌하는지 확인
     */
    static boolean isPossible(int row) {
        for (int i = 0; i < row; i++) {
            // 같은 열에 위치하는지 체크
            if (board[row] == board[i]) {
                return false;
            }
            
            // 2대각선에 위치하는지 체크
            if (Math.abs(row - i) == Math.abs(board[row] - board[i])) {
                return false;
            }
        }
        return true;
    }
}