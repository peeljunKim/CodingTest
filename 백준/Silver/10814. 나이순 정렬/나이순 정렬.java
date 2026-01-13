import java.io.*;
import java.util.*;

public class Main {
    public static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
        
        @Override
        public String toString() {
            return age + " " + name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            
            members[i] = new Member(age, name);
        }

        // 나이순 정렬
        Arrays.sort(members, (m1, m2) -> m1.age - m2.age);

        for (Member m : members) {
            sb.append(m).append('\n');
        }

        System.out.println(sb.toString());
    }
}