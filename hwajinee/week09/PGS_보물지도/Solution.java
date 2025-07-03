package week09.PGS_보물지도;

import java.util.LinkedList;
import java.util.Queue;

/*
    함정을 피해 보물이 있는 칸으로 도달해야 한다. (도달하지 못하면 -1)
    상하좌우로 1칸씩 이동 & 2칸 이동 1번 가능

    (1, 1)에서 BFS로 상하좌우로 가능한 모든 경로를 이동하며 이동거리를 갱신한다.
 */
public class Solution {
    public int solution(int n, int m, int[][] hole) {

        int rowLength = m;
        int colLength = n;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n+1][m+1];

        // 시작점 예약
        queue.add(new int[]{1, 1, 0});
        visited[1][1] = true;

        // bfs
        while(!queue.isEmpty()){


        }


        int answer = 0;
        return answer;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // case 3:
        int[][] hole1 = {{2,3}, {3,3}};
        System.out.println(solution.solution(4, 4, hole1)); // 5

        // case 2:
        int[][] hole2 = {{1,4}, {2,1}, {2,2}, {2,3}, {2,4}, {3,3}, {4,1}, {4,3}, {5,3}};
        System.out.println(solution.solution(5,4, hole2)); // -1
    }
}