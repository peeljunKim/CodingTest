import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        HashSet<String> set = new HashSet<>();
        
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        
        int count = 0;
        
        for (int i = 0; i < M; i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}