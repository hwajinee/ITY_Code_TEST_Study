import java.io.*;

public class BOJ_10870_피보나치수5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            answer = a + b;
            a = b;
            b = answer;
        }

        return answer;
    }
}