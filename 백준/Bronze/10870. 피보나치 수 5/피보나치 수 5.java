import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(fibonacci(n));
        br.close();
    }

    /**
     * @param n 구하고자 하는 순서
     * @return n번째 피보나치 수
     */
    public static int fibonacci(int n) {
        // 0번째는 0, 1번째는 1 반환
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // Fn = Fn-1 + Fn-2
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}