import java.util.Scanner;

public class Main {
    // 문제의 최대 범위 설정
    public static final int MAX = 1000000;
    public static boolean[] isMatch = new boolean[MAX + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isMatch[0] = true;
        isMatch[1] = true;
        
        for (int i = 2; i * i <= MAX; i++) {
            if (!isMatch[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isMatch[j] = true;
                }
            }
        }

        if (!sc.hasNextLine()) {
            return;
        }
        
        int T = Integer.parseInt(sc.nextLine().trim());

        while (T-- > 0) {
            if (!sc.hasNextLine()) break;
            
            String[] input = sc.nextLine().split(" ");
            
            if (input.length == 0 || input[0].isEmpty()) {
                continue;
            }
            
            int N = Integer.parseInt(input[0]);
            int count = 0;

            // 중복을 피하기 위해 (a <= b)
            for (int i = 2; i <= N / 2; i++) {
                if (!isMatch[i] && !isMatch[N - i]) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        sc.close();
    }
}