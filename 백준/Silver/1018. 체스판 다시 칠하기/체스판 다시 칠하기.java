import java.util.*;

public class Main {

    /**
    @param board 보드 상태
    @param startRow 시작 행(맨 위 행)
    @param startCol 시작 행(맨 위 행)
    @param startChar W, B 경우의 수 구분
    **/
    private static int repaintCount(char[][] board, int startRow, int startCol, char startChar) {
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // (i+j)가 짝수면 startChar, 홀수면 반대색
                char ch;
                if ((i + j) % 2 == 0) {
                    ch = startChar;
                } else {
                    ch = (startChar == 'W') ? 'B' : 'W';
                }

                if (board[startRow + i][startCol + j] != ch) {
                    cnt++; // 기대 색과 다르면 다시 칠해야 함
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 행 개수
        int M = sc.nextInt(); // 열 개수
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int r = 0; r <= N - 8; r++) {
            for (int c = 0; c <= M - 8; c++) {
                int wStart = repaintCount(board, r, c, 'W');
                int bStart = repaintCount(board, r, c, 'B');
                int min = Math.min(wStart, bStart);

                if (min < answer) answer = min;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
