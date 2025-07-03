package week10.LC_Number_of_Islands;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        char[][] grid =
                {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        Solution solution = new Solution();
        System.out.println(solution.numIslands(grid));
    }
    public int numIslands(char[][] grid) {

        int rowLength = grid.length; // 행
        int colLength = grid[0].length; // 열

        boolean[][] visited = new boolean[rowLength][colLength];

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        int count = 0;

        // grid 중 미방문 상태에 값이 1인 곳을 시작점으로 BFS 실행
        for(int i=0; i<rowLength; i++){
            for(int j=0; j<colLength; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    //BFS
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                    while(!queue.isEmpty()){
                        int[] cur = queue.poll();
                        int r = cur[0];
                        int c = cur[1];

                        for(int k=0; k<4; k++){
                            int nr = r + dr[k];
                            int nc = c + dc[k];

                            if(isValid(nr, nc, rowLength, colLength)){
                                if(!visited[nr][nc] && grid[nr][nc] == '1'){
                                    queue.add(new int[]{nr, nc});
                                    visited[nr][nc] = true;
                                }
                            }
                        }
                    }
                    count += 1;
                }
            }
        }
        return count;
    }

    private boolean isValid(int nr, int nc, int rowLength, int colLength) {
        if(nr >= 0 && nr < rowLength && nc >= 0 && nc < colLength){
            return true;
        }
        return false;
    }
}