package week_04;
import java.util.*;
public class PGS_가장큰수 {
    public String solution(int[] numbers) {
        // 1. 숫자 배열 -> 문자열 배열로 변환
        String[] index = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            index[i] = String.valueOf(numbers[i]);
        }

        // 2. 정렬
        Arrays.sort(index, (a, b) -> (b + a).compareTo(a + b));


        // 3. 0만 여러 개 있는 경우 처리 (ex. [0, 0, 0])
        if (index[0].equals("0")) {
            return "0";
        }

        // 4. 정렬된 문자열을 하나로 합치기
        StringBuilder answer = new StringBuilder();
        for (String num : index) {
            answer.append(num);
        }

        return answer.toString();
    }
}
