import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 학생 수
        String[] arr = br.readLine().split(" "); // 학생들 번호표
        Stack<Integer> stack = new Stack<>(); // 대기 공간
        int idx = 1; // 간식 번호 순서
        
        // 번호표가 맞는지 확인하고, 아니면 스택에 추가 ++ 학생이 차례인지 확인
        for (String student : arr) {
            int currentStudent = Integer.parseInt(student);
            
            if (currentStudent == idx) {
                idx++;
            } else {
                while (!stack.isEmpty() && stack.peek() == idx) {
                    stack.pop();
                    idx++;
                }
                stack.push(currentStudent);
            }
            
            while (!stack.isEmpty() && stack.peek() == idx) {
                stack.pop();
                idx++;
            }
        }
        
        // 모든 학생을 검사한 후, 스택에 남은 사람들이 순서대로 나갈 수 있는지 확인
        while (!stack.isEmpty()) {
            if (stack.peek() == idx) {
                stack.pop();
                idx++;
            } else {
                break;
            }
        }

        if (idx > N) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
        
    }
}