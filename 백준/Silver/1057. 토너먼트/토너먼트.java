import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        int arr1 = Integer.parseInt(input[1]);
        int arr2 = Integer.parseInt(input[2]);
        
        int round = 0;
        
        while (arr1 != arr2) {
            arr1 = (arr1 + 1) / 2;
            arr2 = (arr2 + 1) / 2;
            round++;
        }
        
        System.out.println(round);
        br.close();
    }
}