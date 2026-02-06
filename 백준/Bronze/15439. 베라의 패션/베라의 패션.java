import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        if (input != null) {
            int N = Integer.parseInt(input);
            int result = N * (N - 1);
            
            System.out.println(result);
        }
    }
}