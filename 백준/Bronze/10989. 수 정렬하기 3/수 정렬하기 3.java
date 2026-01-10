import java.util.*;
import java.io.*;

// 수 정렬하기2 랑 같은 코드를 사용할 때 오류가 나는 이유
// N의 범위가 더 크기 때문 그래서 sort 사용 x 및 BufferedReader로 작성
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }
        
        for (int i = 1; i <= 10000; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.print(sb.toString());
    }
}