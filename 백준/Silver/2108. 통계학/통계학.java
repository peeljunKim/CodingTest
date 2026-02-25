import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[8001]; // 입력값의 범위가 -4000 ~ 4000이므로 카운팅 배열
        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            count[arr[i] + 4000]++;
        }

        // 산술평균 (반올림 처리)
        System.out.println(Math.round(sum / N));

        Arrays.sort(arr);

        // 중앙값
        System.out.println(arr[N / 2]);

        int max = 0;
        for (int i = 0; i < 8001; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        List<Integer> list = new ArrayList<>(); // 최대 빈도수를 가진 숫자들을 리스트
        for (int i = 0; i < 8001; i++) {
            if (count[i] == max) {
                list.add(i - 4000); // 다시 원래 숫자로 복원
            }
        }

        // 최빈값이 여러 개라면 두 번째로 작은 값(index 1) 출력
        if (list.size() > 1) {
            Collections.sort(list);
            System.out.println(list.get(1));
        } else {
            System.out.println(list.get(0));
        }

        // 범위
        System.out.println(arr[N - 1] - arr[0]);
        br.close();
    }
}