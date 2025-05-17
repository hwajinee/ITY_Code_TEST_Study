package week_06;
import java.util.Scanner;
public class BOJ_피보나치수5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] fib = new int[21];  // 0~20까지 저장 가능
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(fib[n]);
    }
}
