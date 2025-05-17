package week06.BOJ_10870_피보나치_수_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if(n==1 || n==2) return 1;
        if(n==0) return 0;
        return fibo(n-1) + fibo(n-2);
    }
}
