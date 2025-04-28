import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        //1번 for문: 문자열 배열 완성하기
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        //문자열 배열에서 a, b 가져와서 비교
        //b+a가 크면, b->a 순으로. a+b가 크면, a->b 순으로 정렬
        //compareTo는 사전순 정렬
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        // 정렬 후 가장 앞에 있는 값이 0이면, 전부 0이라는 의미
        //이걸 안해주면 000이런 식으로 반환됨
        if (nums[0].equals("0")) return "0";

        StringBuilder answer = new StringBuilder();
        //정렬된 nums 배열 돌면서 빌더에 추가
        for (String num : nums) {
            answer.append(num);
        }

        //StringBuilder는 하나의 별도 타입(클래스)으로, string 변환 필요
        return answer.toString();
    }
}
