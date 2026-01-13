import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        int[] origin = new int[N];  // 원본 배열
        int[] sorted = new int[N];  // 정렬한 배열

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            origin[i] = num;
            sorted[i] = num;
        }

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        for (int v : sorted) {
            
            // 이전에 나온 적 없는 숫자일 때만 순위를 매기고 rank 증가
            if (!map.containsKey(v)) {
                map.put(v, rank);
                rank++;
            }
        }

        
        for (int v : origin) {
            sb.append(map.get(v)).append(" ");
        }

        System.out.println(sb.toString());
    }
}