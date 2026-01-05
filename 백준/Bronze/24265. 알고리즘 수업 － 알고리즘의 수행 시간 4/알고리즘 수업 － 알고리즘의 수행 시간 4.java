import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long cnt = n * (n - 1) / 2; 
        System.out.println(cnt);
        System.out.println(2);       

        sc.close();
    }
}
