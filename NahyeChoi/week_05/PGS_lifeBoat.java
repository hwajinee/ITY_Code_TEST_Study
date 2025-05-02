package week_05;

import java.util.Arrays;

public class PGS_lifeBoat {
    //    pgs lifeboat
    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;

            // 1) 몸무게가 적은 순서부터 오름차순 정렬
            Arrays.sort(people);

            int start = 0; // 가장 가벼운 사람
            int end = people.length - 1; // 가장 무거운 사람
            int sum = 0; // 몸무게의 합(최대 2명)

            // 양쪽에서 시작해서 만나는 것이기에 start는 end보다 작거나 같아야함
            while (start <= end) {
                // 두 사람의 무게 더하기(가장 가벼운 사람 + 가장 무거운 사람)
                sum = people[start] + people[end];

                // 만약 무게의 합이 limit보다 적거나 같다면 양쪽 포인터 이동(=태움)
                if (sum <= limit) {
                    start++;
                    end--;
                } else { // limit보다 초과한다면 무거운 사람 혼자 태움(= end 포인터 좌측 이동)
                    end--;
                }
                answer += 1; // 포인터 이동할 때마다 태운 거와 같으니 개수 세기
            }
            return answer;
        }
    }
}
