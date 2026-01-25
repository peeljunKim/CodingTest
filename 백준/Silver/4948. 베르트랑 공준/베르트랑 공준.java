import java.io.*;

public class Main {
    public static boolean[] isNotPrime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        getPrimes();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            
            if (n == 0) break;
            
            // n보다 크고, 2n보다 작거나 같은
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!isNotPrime[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void getPrimes() {
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(isNotPrime.length); i++) {
            if (isNotPrime[i]) { // 이미 걸러진 경우 continue
                continue;
            }
            
            for (int j = i * i; j < isNotPrime.length; j += i) {
                isNotPrime[j] = true;
            }
        }
    }
}