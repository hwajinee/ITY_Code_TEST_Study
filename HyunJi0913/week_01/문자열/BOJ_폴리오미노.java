package week_01.문자열;
import java.util.*;
public class PGS_폴리오미노 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        //. (dot)은 정규표현식에서 "모든 문자" 라는 특수한 의미
        //.split(".") : "모든 문자 하나마다 자르겠다"
        //split("\\.") : 마침표(.)를 기준으로 문자열을 잘라서 배열로
        String[] parts = str.split("\\.");

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            int len = part.length();

            // 덮을 수 없는 경우
            if (len % 2 != 0) {
                System.out.println("-1");
                return;
            }

            StringBuilder replaced = new StringBuilder();
            while (len >= 4) {
                replaced.append("AAAA");
                len -= 4;
            }
            while (len >= 2) {
                replaced.append("BB");
                len -= 2;
            }

            result.append(replaced);

            // '.' 보존
            if (i < parts.length - 1) {
                result.append('.');
            }
        }

        // 입력 끝이 '.'-> 보존
        int dotCount = 0;
        for (int i = str.length() - 1; i >= 0 && str.charAt(i) == '.'; i--) {
            dotCount++;
        }
        while (dotCount-- > 0) {
            result.append('.');
        }

        System.out.println(result.toString());
    }
}
