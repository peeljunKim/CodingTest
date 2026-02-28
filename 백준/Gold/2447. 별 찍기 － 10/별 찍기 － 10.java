import java.io.*;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        makeStar(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 배열 값이 비어있으면 공백, 있으면 별 출력
                sb.append(arr[i][j] == '*' ? '*' : ' ');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
        br.close();
    }

    /**
     * @param x 시작 행 좌표
     * @param y 시작 열 좌표
     * @param size 현재 구역의 크기
     * @param isBlank 공백 구역인지 여부
     */
    static void makeStar(int x, int y, int size, boolean isBlank) {
        // 공백 구역인 경우 아무것도 하지 않음
        if (isBlank) {
            return;
        }

        // 더 이상 쪼갤 수 없는 크기인(1) 경우인 별 기록
        if (size == 1) {
            arr[x][y] = '*';
            return;
        }

        /*
         현재 구역을 3x3으로 쪼갬 (크기 n = size/3)
         예: size=9라면 3x3 크기의 구역 9개가 생김
        */
        int n = size / 3;
        int count = 0; // 9개 구역 중 현재 몇 번째 구역인지 체크
        
        for (int i = x; i < x + size; i += n) {
            for (int j = y; j < y + size; j += n) {
                count++;
                if (count == 5) { // 5번째 구역은 항상 중앙 공백 구역
                    makeStar(i, j, n, true);
                } else {
                    makeStar(i, j, n, false);
                }
            }
        }
    }
}