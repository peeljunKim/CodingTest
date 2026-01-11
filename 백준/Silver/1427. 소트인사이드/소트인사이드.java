import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String s = sc.next();              
        char[] arr = s.toCharArray();   

        Arrays.sort(arr);               

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
