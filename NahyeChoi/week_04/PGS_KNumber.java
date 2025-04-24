package week_04;

import java.util.Arrays;

public class PGS_KNumber {
//    PGS K번째 수
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            // int[] answer = {};
            // commands.length 만큼 answer 배열 크기 지정
            int[] answer = new int[commands.length];

            // commands 대로 주어진 연산하기
            for (int i = 0; i < commands.length; i++) {
                //copyOfRange() : 지정한 배열에서 특정 범위만큼의 요소들을 복사해 새로운 배열로 반환해주는 메서드
                //commands의 첫 번째 원소값부터 두 번째 원소값까지 값을 잘라서 정렬해야함
                //인덱스 계산이 중요해보임
                int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
                Arrays.sort(arr);
                // 연산 후 결과 배열에 담기
                answer[i] = arr[commands[i][2] - 1];
            }
            return answer;
        }
    }
}
