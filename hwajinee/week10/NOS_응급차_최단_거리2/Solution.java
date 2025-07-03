package week10.NOS_응급차_최단_거리2;

/*
    (0, 0)에서 출발하여, (m-1, n-1)에 도착하는 최단거리를 구하고,
    도달할 수 없는 경우 -1을 반환하는 solution 함수를 작성하라.
 */

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[][] city =
                {{0, 0, 1, 0}, {1, 0, 1, 0}, {1, 0, 0, 0}};
        Solution solution = new Solution();
        System.out.println(solution.solution(city));
    }

    public int solution(int[][] city) {

        int rowLength = city.length;
        int colLength = city[0].length;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rowLength][colLength];

        int[] dr = {-1, -1, 0, 0};
        int[] dc = {0, 0, -1, -1};

        // (0, 0)으로 시작점 예약
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        // BFS
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            int distance = curr[2];

            for(int i=0; i<4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < rowLength && nc >= 0 && nc < colLength) {
                    if(city[nr][nc] == 0){
                        // (m-1, n-1) 이면, 거리 반환.
                        if (nr == rowLength - 1 && nc == colLength - 1) {
                            return distance + 1;
                        }
                        queue.add(new int[]{nr, nc, distance + 1});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        return -1;
    }

}
