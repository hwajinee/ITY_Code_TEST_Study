package week_06;

import java.util.ArrayList;

public class PGS_hannoi {
    class Solution {
        // 1) 우선 하노이 탑 이동 경로를 저장할 리스트 선언
        ArrayList<int[]> list = new ArrayList<>();

        public int[][] solution(int n) {
            int[][] answer = {};

            // 하노이탑 재귀 함수
            hannoi(n, 1, 3, 2);

            // 리스트에 저장된 이동 경로를 2차원 배열로 변환
            answer = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++){
                int[] cmd = list.get(i);
                answer[i][0] = cmd[0]; // 츨발 기둥 번호
                answer[i][1] = cmd[1]; // 도착 기둥 번호
            }

            return answer;
        }

        // 2) 하노이탑 재귀 함수
        // 원판의 개수 n개와 출발 기둥, 도착 기둥, 경유 기둥을 매개변수로 받기
        private void hannoi(int n, int from, int to, int via) {
            int[] move = { from, to };

            if (n == 1) { // if, 주어진 원판의 개수가 1개일 경우 바로 도착 기둥으로 바로 이동
                list.add(move);
            } else {
                // (1) : n-1개의 원판을 2번 기둥으로 이동
                hannoi(n - 1, from, via, to);
                // (2) : 가장 큰 원판을 목적지로 이동
                list.add(move);
                // (3) : 2번 기둥에 있는 n-1개의 원판을 3번 기둥으로 이동
                hannoi(n - 1, via, to, from);
            }
        }
    }
}
