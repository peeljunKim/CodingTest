import java.io.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        // 파일의 끝까지 입력을 받음
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            
            // 3의 n승 계산 (길이 설정)
            int len = (int) Math.pow(3, n);
            
            // 결과 문자열 초기화 !!!
            sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                sb.append("-");
            }

            cantor(0, len);
            
            System.out.println(sb.toString());
        }
    }

    /**
     * @param start 시작 인덱스
     * @param len   현재 처리할 문자열의 길이
     */
    public static void cantor(int start, int len) {
        // 길이가 1이면 더 이상 쪼갤 수 없으므로 리턴
        if (len == 1) {
            return;
        }

        // 삼등분한 새로운 길이
        int newLen = len / 3;

        // 왼쪽 부분 (start부터 newLen만큼) -> 재귀
        cantor(start, newLen);

        // 가운데 부분 (start + newLen부터 newLen만큼) -> 공백 처리
        for (int i = start + newLen; i < start + 2 * newLen; i++) {
            sb.setCharAt(i, ' ');
        }

        // 오른쪽 부분 (start + 2 * newLen부터 newLen만큼) -> 재귀
        cantor(start + 2 * newLen, newLen);
    }
}