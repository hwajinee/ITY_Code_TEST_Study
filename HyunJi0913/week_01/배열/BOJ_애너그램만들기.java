package week_01.배열;
import java.util.*;
public class PGS_애너그램만들기 {
    //런타임 에러 발생 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        int i = 0;
        while (i < sb1.length()) {
            boolean matched = false;
            for (int j = 0; j < sb2.length(); j++) {
                if (sb1.charAt(i) == sb2.charAt(j)) {
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(j);
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                i++; // 매치가 안 됐으면 다음 문자로
            }
            // 매치가 됐으면 i 그대로 (한 글자 지워졌기 때문에 같은 위치 다시 검사)
        }

        System.out.println(sb1.length() + sb2.length());
    }
}
