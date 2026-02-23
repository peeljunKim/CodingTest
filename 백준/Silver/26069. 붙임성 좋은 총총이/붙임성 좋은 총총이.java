import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>(); // 댄스 추는 사람

        set.add("ChongChong");

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            String personA = arr[0];
            String personB = arr[1];

            // 두 사람 중 한 명이라도 댄서를 만났다면, 둘 다 댄서가 됨
            if (set.contains(personA) || set.contains(personB)) {
                set.add(personA);
                set.add(personB);
            }
        }

        System.out.println(set.size());
        br.close();
    }
}