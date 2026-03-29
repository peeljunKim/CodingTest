import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        long min = Long.parseLong(input[0]);
        long max = Long.parseLong(input[1]);

        boolean[] isMatch = new boolean[(int) (max - min + 1)];

        for (long i = 2; i * i <= max; i++) {
            long square = i * i;
            
            long start = min / square;
            if (min % square != 0) {
                start++;
            }

            for (long j = start; j * square <= max; j++) {
                isMatch[(int) (j * square - min)] = true;
            }
        }

        int count = 0;  // 제곱 ㄴㄴ수
        for (int i = 0; i < isMatch.length; i++) {
            if (!isMatch[i]) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}