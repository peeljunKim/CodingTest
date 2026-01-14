import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 가지고 있는 숫자 개수
        int[] cards = new int[N]; 
        String[] arr = br.readLine().split(" "); // 숫자 카드에 적혀있는 정수 배열
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine()); // 확인할 숫자
        String[] targetArr = br.readLine().split(" "); // 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 정수
        
        
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(targetArr[i]);
            
            if (Arrays.binarySearch(cards, target) >= 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }

            if (i < M - 1) sb.append(' ');
        }

        System.out.print(sb.toString());
    }
}