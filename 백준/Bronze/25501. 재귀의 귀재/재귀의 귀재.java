import java.io.*;

public class Main {
    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            count = 0;
            int result = isPalindrome(s);

            sb.append(result).append(" ").append(count).append("\n");
        }
        
        System.out.print(sb.toString());
        br.close();
    }
    
    // 팰린드롬 여부를 판별하는 재귀 함수
    public static int recursion(String s, int l, int r) {
        // 함수가 호출될 때마다 카운트 증가
        count++;
        
        // 왼쪽 인덱스가 오른쪽보다 크거나 같으면 모든 검사 통과 (팰린드롬 맞음)
        if (l >= r) return 1;
        // 양 끝 문자가 다르면 팰린드롬 아님
        else if (s.charAt(l) != s.charAt(r)) return 0;
        // 다음 안쪽 문자 검사
        else return recursion(s, l + 1, r - 1);
    }

    // 팰린드롬 판별 시작 함수
    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}