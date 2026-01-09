import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int bags = 0;

        while (N > 0) {
            // 5로 나누어떨어지면 5kg 봉지
            if (N % 5 == 0) {
                bags += N / 5;
                System.out.println(bags);
                sc.close();
                return;
            }

            // 아니면 3kg 봉지 하나 사용
            N -= 3;
            bags++;
        }

        if (N == 0) {
            System.out.println(bags);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
