package week11.Network_Delay_Time;

import java.sql.Array;
import java.util.*;

/*
        k(전파 시작 노드)로부터, 모든 노드에 도달하기까지 걸리는 최소 시간 구하기.
        모든 노드에 도달할 수 없는 경우, -1을 리턴하기.

        가중치 그래프 -> 다익스트라 알고리즘 !!!
     */
public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // 인접 그래프
        List<List<Edge>> graph = new ArrayList<>();

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] time: times){
            int u = time[0]-1; // 인접리스트가 0번부터 시작하기 때문
            int v = time[1]-1;
            int w = time[2];

            graph.get(u).add(new Edge(v, w));
        }

        // Dijkstra
        Queue<Entry> pq = new PriorityQueue<>();

        final int INF = Integer.MAX_VALUE;
        int[] distance = new int[n];
        Arrays.fill(distance, INF);

        // 시작점 예약
        pq.add(new Entry(k-1, 0));
        distance[k-1] = 0;

        while(!pq.isEmpty()){
            Entry cur = pq.remove();

            for(Edge next : graph.get(cur.node)) {
                int nextDist = distance[cur.node] + next.cost;
                if(nextDist < distance[next.node]) {
                    pq.add(new Entry(next.node, nextDist));
                    distance[next.node] = nextDist;
                }
            }
        }

        int maxTime = 0;
        for(int i=0; i<distance.length; i++){
            maxTime = Math.max(maxTime, distance[i]);
        }
        return (maxTime == INF)? -1 : maxTime;
    }

    class Edge {
        int node; // 인접 노드 번호
        int cost; // 인접노드까지의 가중치
        Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    class Entry implements Comparable<Entry> {
        int node;
        int distance;
        Entry(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Entry o) {
            return this.distance - o.distance;
        }
    }

    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}; // {u, v, w} : u(출발 노드), v(도착 노드), w(가중치)
        int n = 4;  // 전체 노드 개수
        int k = 2;  // 전파 시작 노드

        Solution solution = new Solution();
        System.out.println(solution.networkDelayTime(times, n, k));
    }
}