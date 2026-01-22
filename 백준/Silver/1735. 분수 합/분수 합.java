import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 분자 A, 분모 B
        String[] arr1 = br.readLine().split(" ");
        long a = Long.parseLong(arr1[0]);
        long b = Long.parseLong(arr1[1]);

        // 분자 C, 분모 D
        String[] arr2 = br.readLine().split(" ");
        long c = Long.parseLong(arr2[0]);
        long d = Long.parseLong(arr2[1]);

        long num1 = a * d + c * b; // 분자
        long num2 = b * d; // 분모

        long result = gcd(num1, num2);

        System.out.println((num1 / result) + " " + (num2 / result));
    }

    // 최대공약수 메소드
    public static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}