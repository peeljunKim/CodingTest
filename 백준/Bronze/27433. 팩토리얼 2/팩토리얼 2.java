import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        System.out.println(factorial(N));
        br.close();
    }

    public static long factorial(int n) {
        // 0과 1은 무조건 결과가 1임
        if (n <= 1) {
            return 1;
        }
        
        // 재귀 호출: n * (n-1)!
        return n * factorial(n - 1);
    }
}