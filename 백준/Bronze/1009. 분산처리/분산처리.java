import java.io.*;

// 일의 자리만 중요
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int result = 1;
            
            // a^b
            // 어떤 수의 거듭제곱에서 일의 자리는 일정한 주기를 가지고 반복
            // 즉, b가 횟수가 됨
            // 2 4 8 16 / 32 64 128 256
            // 3 9 27 81  / 243 729
            // 4 16 / 64 256 
            for (int j = 0; j < b; j++) {
                result = (result * a) % 10;
            }

            if (result == 0) {
                sb.append(10).append("\n");
            } else {
                sb.append(result).append("\n");
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}