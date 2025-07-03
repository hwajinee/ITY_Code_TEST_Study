package week11.LC_Network_Delay_Time;

import java.util.*;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // 그래프 변환 (인접리스트로 변환)
        List<List<Edge>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] time: times){
            // time : {u, v, w} => {시작노드, 도착노드, 가중치}
            int u = time[0];
            int v = time[1];
            int w = time[2];

            graph.get(u).add(new Edge(v, w));
        }

        // 다익스트라 알고리즘
        final int INF = Integer.MAX_VALUE;
        int[] distance = new int[graph.size() + 1]; // 1번부터 사용할 것임.
        Arrays.fill(distance, INF);

        Queue<Edge> pq = new PriorityQueue<>();

        // 시작점 예약하기
        pq.offer(new Edge(k, 0));
        distance[k] = 0;

        while(!pq.isEmpty()){
            // 방문
            Edge cur = pq.remove();

            // 예약
            for(Edge next : graph.get(cur.node)) {
                // 무조건 예약하는 것 아님. distance에 저장된 값과 cur.node 통해서 가는 비용을 비교.
                // 이 때, cur.node를 통해서 가는 비용 nextDist = distance[cur.node] + next.distance;
                int nextDist = distance[cur.node] + next.cost;
                if(nextDist < distance[next.node]) {
                    pq.add(new Edge(next.node, nextDist));
                    distance[next.node] = nextDist;
                }
            }
        }

        // 최소비용들 중에서 가장 큰 값을 찾아서 return, 도달 못한 노드가 하나라도 있으면 -1 return
        int maxTime = 0;
        for(int i=1; i<= n; i++) {
            maxTime = Math.max(maxTime, distance[i]);
        }
        return (maxTime == INF)? -1 : maxTime;
    }

    class Edge implements Comparable<Edge> {
        int node;
        int cost;
        Edge(int node, int cost){
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;

        Solution solution = new Solution();
        System.out.println(solution.networkDelayTime(times, n, k));
    }
}