import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        boolean[] isMatch = new boolean[N + 1]; // 소수 판별 배열 (false 소수, true 소수 아님)

        isMatch[0] = true;
        isMatch[1] = true;

        for (int i = 2; i * i <= N; i++) {
            if (isMatch[i]) continue;
            
            for (int j = i * i; j <= N; j += i) {
                isMatch[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!isMatch[i]) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.print(sb.toString());
    }
}