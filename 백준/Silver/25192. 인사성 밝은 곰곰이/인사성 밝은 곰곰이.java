import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> userLog = new HashSet<>(); // 중복 유저
        int cnt = 0;
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            
            if (line.equals("ENTER")) {
                userLog.clear();
            } else {
                if (!userLog.contains(line)) {
                    userLog.add(line);
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);
        br.close();
    }
}