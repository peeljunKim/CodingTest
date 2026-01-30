import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            
            while (true) {
                if (isMatch(n)) {
                    sb.append(n).append("\n");
                    break;
                }
                n++;
            }
        }
        
        System.out.print(sb.toString());
    }

    // 소수 판별 메서드
    public static boolean isMatch(long num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}