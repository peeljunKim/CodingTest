import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int left = a1 * n0 + a0; // f(n0)
        int right = c * n0;

        if (a1 <= c && left <= right) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
