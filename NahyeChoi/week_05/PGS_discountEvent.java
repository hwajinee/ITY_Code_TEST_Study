package week_05;

import java.util.HashMap;
import java.util.Map;

public class PGS_discountEvent {

    class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;

            // 맵으로 변환
            Map<String, Integer> wantMap = new HashMap<>();
            for (int i = 0; i < want.length; i++) {
                wantMap.put(want[i], number[i]);
            }

            // 10일 윈도우 크기이고, 전체 할인 기간 - 맨 처음값 10日
            for (int i = 0; i <= discount.length - 10; i++) {
                Map<String, Integer> copyWantMap = new HashMap<>(wantMap); // 복사본 생성

                // 10일간 파는 목록을 돌며, want 상품 목록과 일치하는지 파악
                for (int j = 0; j < 10; j++) {
                    String item = discount[i + j];
                    if (copyWantMap.containsKey(item)) { //일치하는 목록이 있으면
                        copyWantMap.put(item, copyWantMap.get(item) - 1);
                    }
                }

                boolean allZero = true; //플래그
                for (int v : copyWantMap.values()) {
                    if (v != 0) {
                        allZero = false;
                        break;
                    }
                }
                if (allZero) answer += 1;
            }
            return answer;
        }
    }
}
