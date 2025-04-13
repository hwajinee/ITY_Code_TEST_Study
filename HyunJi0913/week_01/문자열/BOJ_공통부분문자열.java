package week_01.문자열;
import java.util.*;
public class BOJ_공통부분문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int max= 0;

        // s1에서 모든 부분 문자열 만들기
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String sub = str1.substring(i, j); // 부분 문자열

                // s2에 포함되어 있는지 확인
                if (str2.contains(sub)) {
                    if (sub.length() > max) {
                        max = sub.length();
                    }
                }
            }
        }

        System.out.println(max);
    }
}
