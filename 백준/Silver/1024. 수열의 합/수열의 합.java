import java.io.*;

/*
N(정수의 합) = (x * len) + {(len - 1) * len} / 2
{(len - 1) * len} / 2 이걸 y로 치환

그래서 x = (N - y) / len 
*/
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        long N = Long.parseLong(input[0]);
        long L = Long.parseLong(input[1]);

        for (long len = L; len <= 100; len++) {
            long num = (len * (len - 1)) / 2;
            long numerator = N - num;

            if (numerator < 0) break;

            if (numerator % len == 0) {
                long x = numerator / len;
                
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < len; i++) {
                    sb.append(x + i).append(" ");
                }
                System.out.println(sb.toString().trim());
                return;
            }
        }

        System.out.println("-1");
        br.close();
    }
}