import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 총 도시 수
        int m = Integer.parseInt(st.nextToken()); // 총 도로 개수
        int k = Integer.parseInt(st.nextToken()); // 최단 거리
        int x = Integer.parseInt(st.nextToken()); // 시작점 도시
        
        //인접리스트 생성
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i=1 ; i <= n ; i++) {
            map.put(i, new ArrayList<>());
        }
        
        for (int i=0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int tempStart = Integer.parseInt(st.nextToken());
            int tempEnd = Integer.parseInt(st.nextToken());
            map.get(tempStart).add(tempEnd);
        }
        
        // BFS 사용 -> 최단거리가 K인 모든 도시 배열 계산
        ArrayList<Integer> answer = bfs(n,x,k,map);
        
        Collections.sort(answer);
        
        for (Integer a : answer) {
            System.out.println(a);
        }
    }
    
    private static ArrayList<Integer> bfs(int n, int x,int k,Map<Integer,List<Integer>> map) {
        ArrayList<Integer> answer = new ArrayList<>();
        boolean[] visited = new boolean[n+1];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,0});
        visited[x]=true;
        
        while(!queue.isEmpty()){
            // 현재 노드 방문
            // -> queue에서 poll
            int[] curr = queue.poll();
            int currCity = curr[0];
            int dist = curr[1];
            
            // 최단거리 k 이상이면 continue
            if (dist > k ) continue;
            // 최단거리 k에 부합하는 도시면 answer 배열에 넣기
            if (dist == k) {
                answer.add(currCity);
            }
            
            // 다음 노드 예약
            // -> for문 사용
            for (int next : map.get(currCity)){
                if (!visited[next]){
                    visited[next] = true;
                    queue.offer(new int[]{next,dist+1});    
                }
            }  
        }
        if (answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}
