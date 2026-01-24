import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        if (input != null && !input.isEmpty()) {
            long n = Long.parseLong(input.trim());
            int result = (int) Math.sqrt(n);
            
            System.out.println(result);
        }
        
        br.close();
    }
}