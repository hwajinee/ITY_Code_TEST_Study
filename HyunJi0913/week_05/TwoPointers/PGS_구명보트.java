package week_05.TwoPointers;

import java.util.Arrays;

public class PGS_구명보트 {

    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        // 테스트 입력 1
        int[] people1 = {70, 50, 80, 50};
        int limit1 = 100;
        System.out.println("구명보트 수 (예제 1): " + solution(people1, limit1)); // 출력: 3

        // 테스트 입력 2
        int[] people2 = {70, 80, 50};
        int limit2 = 100;
        System.out.println("구명보트 수 (예제 2): " + solution(people2, limit2)); // 출력: 3

        // 추가 입력 예시
        int[] people3 = {40, 40, 80, 90};
        int limit3 = 120;
        System.out.println("구명보트 수 (예제 3): " + solution(people3, limit3)); // 출력: 3
    }
}
