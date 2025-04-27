package week_04;

import java.util.Arrays;

public class PGS_stringsSort {
    // PGS 문자열 내 마음대로 정렬하기
    class Solution {
        public String[] solution(String[] strings, int n) {

            // 람다식 사용하여 정렬
            // 1) (s1, s2) string[] 배열 하나하나 비교
            Arrays.sort(strings, (s1, s2) -> {
                if (s1.charAt(n) == s2.charAt(n)) { // if, 두 문자열의 n번 째 문자가 같으면
                    return s1.compareTo(s2); // 두 문자열을 사전순으로 비교해서 정렬. (이때 반환값은 음수, 0, 양수)
                } else {
                    // 같지 않으면, n번 째 문자의 아스키코드를 기준으로 비교. (이때 반환값 또한 음수, 0, 양수)
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
            });

            return strings;
        }
    }
}
