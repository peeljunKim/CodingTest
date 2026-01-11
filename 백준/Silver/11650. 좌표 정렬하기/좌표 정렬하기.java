import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" "); 
            arr[i][0] = Integer.parseInt(line[0]); // x좌표
            arr[i][1] = Integer.parseInt(line[1]); // y좌표
        }

        Arrays.sort(arr, (p1, p2) -> {
            if (p1[0] == p2[0]) {
                return Integer.compare(p1[1], p2[1]);
            }
            return Integer.compare(p1[0], p2[0]);
        });

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            sb
                .append(arr[i][0])
                .append(" ")
                .append(arr[i][1])
                .append("\n");
        }
        
        System.out.print(sb.toString());
    }
}