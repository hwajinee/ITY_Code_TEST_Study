package week_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25501 {
    public static int count = 0; // 전역 변수 선언

    public static void main(String[] args) throws IOException {
        // boj 25501 재귀의 귀재

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            System.out.println(isPalindrome(s) + " " + count);
        }
    }

    public static int recursion(String s, int l, int r) {
        count++; //호출 횟수 증가
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        count = 0; // 호출될 때마다 count 초기화
        return recursion(s, 0, s.length() - 1);
    }
}
