import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 주어진 카드 수
        int M = sc.nextInt();  // 넘지 말아야 되는 숫자

        int[] cards = new int[N];
        int result = 0;
        
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];

                    if (sum <= M && sum > result) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}
