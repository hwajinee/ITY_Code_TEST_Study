package week_04;
import java.util.*;
public class PGS_문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 글자를 먼저 비교
                if (s1.charAt(n) == s2.charAt(n)) {
                    // 같으면 전체 문자열 기준으로 사전순 정렬
                    return s1.compareTo(s2);
                } else {
                    // 다르면 n번째 글자끼리 비교
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
            }
        });

        return strings;
    }
}
// 비교 기준을 직접 바꿔서 정렬할때는 comparator 꼭 사용 !!