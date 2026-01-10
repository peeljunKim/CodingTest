import java.util.*;

// 숫자가 중복으로 안 나옴 문제 예제에서 5 5 가 나오는데 첫 번째 5는 수의 개수임
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int x : arr) {
            sb.append(x).append('\n');
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
