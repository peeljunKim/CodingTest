import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>(); // 여기서 중복 제거
        
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> wordList = new ArrayList<>(set);

        Collections.sort(wordList, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });

        for (String word : wordList) {
            sb.append(word).append('\n');
        }

        System.out.print(sb.toString());
    }
}