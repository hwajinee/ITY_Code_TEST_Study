package week_04;

import java.util.Arrays;

public class PGS_bigNumber {
//    PGS 가장 큰 수
class Solution {
    public String solution(int[] numbers) {
        String[] numStr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numStr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (numStr[0].equals("0")) { return "0"; } // 전부 0일 때 예외처리

        StringBuilder answer = new StringBuilder();
        for (String s : numStr) {
            answer.append(s);
        }
        return answer.toString();
    }
}
}
