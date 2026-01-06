import java.util.Scanner;

public class Main {

    // 분해합(자기 자신 + 각 자리수 합) 계산하는 메소드
    private static int methode01(int x) {
        int sum = x;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int start = Math.max(1, N - 63);
        int result = 0;

        for (int i = start; i <= N; i++) {
            if (methode01(i) == N) {
                result = i; // 가장 작은 생성자
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
