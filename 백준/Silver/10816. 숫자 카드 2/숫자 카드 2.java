import java.util.*;
import java.io.*;

// hashmap에 key의 자료형이 String 이였는데 integer로 넣어놈 숫자라 그냥 integer라고 한 듯
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()); // 숫자 카드의 개수
        HashMap<String, Integer> cardMap = new HashMap<>(); // key 숫자, value 개수
        String[] cards = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            String num = cards[i];
            cardMap.put(num, cardMap.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine()); // 질문 개수
        String[] questions = br.readLine().split(" ");
        
        for (int i = 0; i < m; i++) {
            String str = questions[i]; // 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수
            sb.append(cardMap.getOrDefault(str, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}