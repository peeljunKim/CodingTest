import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // 첫 번째 방정식 (ax + by = c)
        int a = sc.nextInt(); // x의 계수
        int b = sc.nextInt(); // y의 계수
        int c = sc.nextInt(); // c의 값

        // 두 번째 방정식 (dx + ey = f)
        int d = sc.nextInt(); // x의 계수
        int e = sc.nextInt(); // y의 계수
        int f = sc.nextInt(); // f의 값

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    System.out.println(x + " " + y);
                    sc.close();
                    return;
                }
            }
        }

        sc.close();
    }
}
