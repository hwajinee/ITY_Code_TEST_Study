import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        int count = 0;
        int window = 10;

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - window; i++) {
            Map<String, Integer> discountMap = new HashMap<>();

            for (int j = i; j < i + window; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            if (discountMap.equals(wantMap)) {
                count++;
            }
        }

        return count;
    }
}
