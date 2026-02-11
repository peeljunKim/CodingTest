import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        int N = Integer.parseInt(input);
        int result = 1;
        
        for (int i = 0; i < N; i++) {
            result *= 2; 
        }
        
        System.out.println(result);
        
        br.close();
    }
}