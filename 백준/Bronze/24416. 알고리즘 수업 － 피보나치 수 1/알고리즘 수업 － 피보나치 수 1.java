import java.io.*;

public class Main {
    static int countRecursive = 0; // 코드1 실행 횟수
    static int countDP = 0;        // 코드2 실행 횟수
    static int[] f;               // DP용 배열

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        f = new int[n + 1];

        // 코드1 횟수 구하기(재귀 방식)
        fib(n);
        
        // 코드2 횟수 구하기(DP방식)
        fibonacci(n);

        System.out.println(countRecursive + " " + countDP);
        br.close();
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            countRecursive++; 
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n) {
        f[1] = f[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            countDP++; 
            f[i] = f[i - 1] + f[i - 2];
        }
        
        return f[n];
    }
}