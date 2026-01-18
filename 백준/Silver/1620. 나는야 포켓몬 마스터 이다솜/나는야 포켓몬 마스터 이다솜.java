import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        String[] arr = new String[n + 1]; // 번호 이름
        HashMap<String, Integer> map = new HashMap<>(); // key 이름, value 번호
        StringBuilder sb = new StringBuilder();

        // 도감 등록
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            arr[i] = name;
            map.put(name, i);
        }
        
        for (int i = 0; i < m; i++) {
            String question = br.readLine(); // 오박사가 던진 문제
            char firstChar = question.charAt(0);

            if (firstChar >= '0' && firstChar <= '9') {
                int idx = Integer.parseInt(question);
                sb.append(arr[idx]).append("\n");
            } else {
                sb.append(map.get(question)).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}