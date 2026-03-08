import java.io.*;

public class Main {
    static int[] tmp;     // 병합을 위한 임시 배열
    static int count = 0; // 저장 횟수 카운트
    static int K;         // 찾고자 하는 K번째
    static int result = -1; // 결과값

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        K = Integer.parseInt(firstLine[1]);
        int[] A = new int[N];
        String[] secondLine = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(secondLine[i]);
        }

        tmp = new int[N]; 
        
        merge_sort(A, 0, N - 1);

        System.out.println(result);
        
        br.close();
    }

    static void merge_sort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);      // 전반부 정렬
            merge_sort(A, q + 1, r);  // 후반부 정렬
            merge(A, p, q, r);        // 병합
        }
    }

    static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        // 두 부분 배열을 비교하며 tmp에 정렬된 순서로 담기
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        // 왼쪽 배열 부분이 남은 경우
        while (i <= q) {
            tmp[t++] = A[i++];
        }

        // 오른쪽 배열 부분이 남은 경우
        while (j <= r) {
            tmp[t++] = A[j++];
        }

        // 정렬된 tmp 배열의 값을 원본 배열 A에 저장하는 과정
        i = p;
        t = 0;
        while (i <= r) {
            count++;
            // K번째 저장이 발생하는 순간 결과값 기록
            if (count == K) {
                result = tmp[t];
            }
            A[i++] = tmp[t++];
        }
    }
}