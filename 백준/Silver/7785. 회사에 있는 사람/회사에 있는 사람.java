import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();  // 회사에 있는 사람들 저장
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            String name = arr[0];
            String action = arr[1]; // 출입 상태 (enter/leave)
            
            if (action.equals("enter")) {
                set.add(name);
            } else if (action.equals("leave")) {
                set.remove(name);
            }
        }
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        for (String name : list) {
            sb.append(name).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}