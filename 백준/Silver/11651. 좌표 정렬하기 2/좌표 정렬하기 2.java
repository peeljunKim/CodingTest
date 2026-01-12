import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(line[0]); // x
            arr[i][1] = Integer.parseInt(line[1]); // y
        }

        Arrays.sort(arr, (p1, p2) -> {
            if (p1[1] != p2[1]) {
                return p1[1] - p2[1];
            }
            return p1[0] - p2[0];
        });

        for (int i = 0; i < N; i++) {
            sb
                .append(arr[i][0])
                .append(' ')
                .append(arr[i][1])
                .append('\n');
        }

        System.out.print(sb.toString());
    }
}