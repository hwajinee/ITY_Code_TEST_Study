import java.lang.Math;

class Solution {
    public static boolean visited[];
    public static int max = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
            
        return max;
    }
    public static void dfs(int hp, int[][] dungeons,int count){
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && hp>=dungeons[i][0]){
                visited[i] = true;
                dfs(hp-dungeons[i][1], dungeons, count+1);
                visited[i] = false;
            }
        }
        max = Math.max(max, count);
    }
}
