import java.util.*;
import java.io.*;

public class Main {
    static long[] count = new long[10]; // 0부터 9까지 숫자의 개수를 저장할 배열

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long start = 1; // 시작 페이지
        long end = n;   // 마지막 페이지
        long point = 1; // 자릿수

        // 시작 페이지를 끝 페이지보다 작거나 같을 때까지 반복
        while (start <= end) {
            // 끝 페이지의 일의 자리를 9로 맞춤
            while (end % 10 != 9 && start <= end) {
                calculate(end, point);
                end--;
            }

            if (start > end) break;

            // 시작 페이지의 일의 자리를 0으로 맞춤
            while (start % 10 != 0 && start <= end) {
                calculate(start, point);
                start++;
            }

            // 자릿수 차이를 이용해 0~9까지 숫자를 한꺼번에 더함
            start /= 10;
            end /= 10;
            
            for (int i = 0; i < 10; i++) {
                count[i] += (end - start + 1) * point;
            }

            // 다음 자릿수로 이동
            point *= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(count[i]).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }

    public static void calculate(long n, long point) {
        while (n > 0) {
            count[(int) (n % 10)] += point;
            n /= 10;
        }
    }
}