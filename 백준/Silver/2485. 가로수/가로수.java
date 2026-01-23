import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 가로수의 개수
        int[] trees = new int[N];
        
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        
        int findGcd = 0; // 최대 공약수
        for (int i = 0; i < N - 1; i++) {  // 간격들의 최대공약수 구하기
            int distance = trees[i + 1] - trees[i];
            findGcd = gcd(distance, findGcd); 
        }

        // 새로 심어야 하는 나무의 개수
        long totalTreesNeed = (long)(trees[N - 1] - trees[0]) / findGcd + 1;
        long result = totalTreesNeed - N;

        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}