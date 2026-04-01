import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // 파일 개수
        char[] pattern = br.readLine().toCharArray(); // 첫번째 파일

        for (int i = 1; i < N; i++) {
            char[] currentFile = br.readLine().toCharArray(); 
            
            for (int j = 0; j < pattern.length; j++) {
                // 이미 ?인 경우는 건너뛰고, 문자가 서로 다르면 ?로 변경
                if (pattern[j] != '?' && pattern[j] != currentFile[j]) {
                    pattern[j] = '?';
                }
            }
        }

        System.out.println(String.valueOf(pattern));
        br.close();
    }
}