package week11.PGS_등산코스_정하기;

import java.util.*;

public class Solution {
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {

        // 인접 리스트
        List<List<Edge>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] path : paths) {
            int u = path[0];
            int v = path[1];
            int w = path[2];

            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        // gates, summits 배열 -> List로 변환. (dijkstra에서 contains 사용하기 위함.)
        List<Integer> gateList = new ArrayList<>();
        for(int i=0; i< gates.length; i++){
            gateList.add(gates[i]);
        }

        List<Integer> summitList = new ArrayList<>();
        for(int i=0; i< summits.length; i++){
            summitList.add(summits[i]);
        }

        int min = Integer.MAX_VALUE;
        int num = -1;
        for(int gate : gates) {
            System.out.print("gate: " + gate);
            for(int summit : summits){

                System.out.println(", summit: " + summit);
                int result = Math.min(dijkstra(gate, summit, graph, gateList, summitList), dijkstra(summit, gate, graph, gateList, summitList));
                if(result < min){
                    // summis이 오름차순 정렬되어 있기 때문에, result == min은 갱신하지 않고 result < min 만 갱신한다면,
                    //자동으로 최소 intensity가 동일한 값일 때, 더 작은 번호를 가진 산봉우리가 num에 들어가게 된다.
                    min = result;
                    num = summit;
                }
            }
        }
        int[] answer = {num, min};
        return answer;
    }

    private int dijkstra(int start, int end, List<List<Edge>> graph, List<Integer> gates, List<Integer> summits) {
        // 1. start -> end 로 이동하며 업데이트된 최소 intensity 값 반환
        // 2. 이 때, start, end 를 제왼한 gates, summits의 노드는 거치지 않아야 함.

        Queue<State> pq = new PriorityQueue<>();

        final int INF = Integer.MAX_VALUE;
        int[] intensity = new int[graph.size()]; // 그래프와 마찬가지로, 0번 인덱스 사용하지 않음.
        Arrays.fill(intensity, INF);

        // 시작점 예약
        pq.add(new State(start, INF));

        while(!pq.isEmpty()) {
            State cur = pq.remove();
            System.out.print(cur.node);
            for(Edge next : graph.get(cur.node)) {
                // 조건 2
                if(!gates.contains(next.node) && !summits.contains(next.node)){
                    System.out.println(" - next: " + next.node);
                    int cur_update = Math.min(intensity[cur.node], next.cost);
                    if( cur_update < intensity[next.node]){
                        pq.add(new State(next.node, cur_update));
                        intensity[next.node] = cur_update;
                        System.out.println(" ==> " + cur_update);
                    }
                }
            }
        }

        System.out.println(intensity[end]);

        return intensity[end];
    }

    class Edge {
        int node;
        int cost;
        Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    class State implements Comparable<State> {
        int node;
        int min_intensity;
        State(int node, int min_intensity) {
            this.node = node;
            this.min_intensity = min_intensity;
        }
        @Override
        public int compareTo(State o) {
            return this.min_intensity - o.min_intensity;
        }
    }

    public static void main(String[] args) {
         int n = 6;
         int[][] paths = {{1, 2, 3}, {2, 3, 5}, {2, 4, 2}, {2, 5, 4}, {3, 4, 4}, {4, 5, 3}, {4, 6, 1}, {5, 6, 1}};
         int[] gates = {1, 3};
         int[] summits = {5};

         Solution solution = new Solution();
//         System.out.println(solution.solution(n, paths, gates, summits));
        int[] result = solution.solution(n, paths, gates, summits);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

}