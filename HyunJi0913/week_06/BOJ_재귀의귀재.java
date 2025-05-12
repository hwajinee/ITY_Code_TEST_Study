package week_06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_재귀의귀재 {
    static int count;  // 재귀 호출 횟수

    public static int recursion(String s, int l, int r) {
        count++;  // 호출될 때마다 증가
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        count = 0;  // 호출 횟수 초기화
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  // 테스트케이스 수

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int result = isPalindrome(str);
            System.out.println(result + " " + count);
        }
    }
}

