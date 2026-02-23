import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        Map<String, Integer> wordMap = new HashMap<>(); // key 단어, value 횟수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordMap.keySet());

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 많이 나오면 앞으로 (내림차순)
                if (wordMap.get(o1) != wordMap.get(o2)) {
                    return wordMap.get(o2) - wordMap.get(o1);
                }
                // 2. 길이가 길수록 앞으로(내림차순)
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 알파벳 사전 순으로 앞으로 (오름차순)
                return o1.compareTo(o2);
            }
        });

        for (String word : words) {
            sb.append(word).append("\n");
        }
        
        System.out.print(sb.toString());
        br.close();
    }
}