import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        // (n-2)(n-1)n / 3!(쉽게 이야기하면 최고차항의 차수)
        long result = n * (n - 1) * (n - 2) / 6;

        System.out.println(result);
        System.out.println(3);

        sc.close();
    }
}
