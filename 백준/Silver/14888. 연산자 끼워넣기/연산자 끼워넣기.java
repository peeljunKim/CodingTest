import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] numbers;
    static int[] operators = new int[4]; // +, -, *, /
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        String[] numInput = br.readLine().split(" "); // 숫자
        String[] opInput = br.readLine().split(" "); // 연산자의 개수
        
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(numInput[i]);
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(opInput[i]);
        }

        dfs(numbers[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int currentSum, int idx) {
        if (idx == N) {
            max = Math.max(max, currentSum);
            min = Math.min(min, currentSum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--; // 연산자 사용

                if (i == 0) dfs(currentSum + numbers[idx], idx + 1);
                else if (i == 1) dfs(currentSum - numbers[idx], idx + 1);
                else if (i == 2) dfs(currentSum * numbers[idx], idx + 1);
                else if (i == 3) dfs(currentSum / numbers[idx], idx + 1);
                
                /*
                위치가 중요
                if 절에 들어가지 않으면 해당 연산자를 사용하지 않았을 때도 연산자 갯수가 늘어나버림
                */
                operators[i]++; 
            }
            
        }
    }
}