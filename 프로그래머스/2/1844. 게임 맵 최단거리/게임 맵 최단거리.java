import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // BFS로 최단거리 구하기
        // 시작점 예약 (0,0,거리 1)
        int[] dr = {1,0,-1,0};
        int[] dc = {0,-1,0,1};
        
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
       
        
        queue.offer(new int[]{0,0,1});
        visited[0][0] = true;
        
        System.out.println(Arrays.deepToString(visited));
        
        while(!queue.isEmpty()) {
            // 현재 노드 방문
            int[] cur = queue.poll();
            int r = cur[0], c= cur[1], dist = cur[2];
            
            // if 도착지 도달 시 return dist
            if (r == n-1 && c == m-1) return dist;
            
            // 다음 노드 예약
            for( int i = 0; i < 4 ; i++) {
                int nr = r + dr[i], nc = c + dc[i];
                if (nr>= 0 && nr < n && nc >= 0 && nc < m && maps[nr][nc]==1){
                    if(!visited[nr][nc]){
                        visited[nr][nc]= true;
                        queue.offer(new int[]{nr,nc,dist+1});
                        
                    }
                }
            }
            
        }
        
        return -1; // 상대 팀 진영 도착 못 할 때
    }
}