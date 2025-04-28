package week_04;
import java.util.*;
public class PGS_가장가까운글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> last = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (last.containsKey(ch)) {
                // 이전에 등장한 위치가 있다면, 거리 계산
                answer[i] = i - last.get(ch);
            } else {
                // 처음 등장한 글자라면 -1
                answer[i] = -1;
            }

            // 현재 문자의 위치 저장
            last.put(ch, i);
        }

        return answer;
    }
}
