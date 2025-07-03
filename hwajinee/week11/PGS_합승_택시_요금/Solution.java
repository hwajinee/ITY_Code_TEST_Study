package week11.PGS_합승_택시_요금;

/*
    s, a, b 를 제외한 모든 노드는 k가 될 수 있다.
    s -> k, k -> a, k -> b 합이 최소가 되는 k를 구한다.
 */

import java.util.*;

public class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        // 인접리스트 만들기
        List<List<Edge>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<fares.length; i++){
            int u = fares[i][0];
            int v = fares[i][1];
            int w = fares[i][2];

            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        // 다익스트라 알고리즘
        int[] arr1 = dijkstra(s, graph);
        int[] arr2 = dijkstra(a, graph);
        int[] arr3 = dijkstra(b, graph);

        int minSum = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++) {
            if(arr1[i] != -1 && arr2[i] != -1 && arr3[i] != -1){
                minSum = Math.min(minSum, arr1[i] + arr2[i] + arr3[i]);
            }
        }
        return minSum;
    }

    // 시작 노드(s, a, b)에서 나머지 모든 노드까지의 최소 거리를 배열로 반환.
    int[] dijkstra(int start, List<List<Edge>> graph) {
        int[] result = new int[graph.size()+1];

        Queue<Edge> pq = new PriorityQueue<>();

        final int INF = Integer.MAX_VALUE;
        int[] distance = new int[graph.size()+1];
        Arrays.fill(distance, INF);

        pq.add(new Edge(start, 0));
        distance[start] = 0;

        while(!pq.isEmpty()) {
            Edge cur = pq.remove();
            for (Edge next : graph.get(cur.node)) {
                int nextDist = distance[cur.node] + next.cost;
                if (nextDist < distance[next.node]) {
                    pq.add(new Edge(next.node, nextDist));
                    distance[next.node] = nextDist;
                }
            }
        }

        for(int i=1; i<= graph.size(); i++){
            if(distance[i] == Integer.MAX_VALUE){
                result[i] = -1;
            } else {
                result[i] = distance[i];
            }
        }

        return result;
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
        int[][] fares1 = {{5, 7, 9}, {4, 6, 4}, {3, 6, 1}, {3, 2, 3}, {2, 1, 6}};
        int[][] fares2 = {{2, 6, 6}, {6, 3, 7}, {4, 6, 7}, {6, 5, 11}, {2, 5, 12}, {5, 3, 20}, {2, 4, 8}, {4, 3, 9}};
        Solution solution = new Solution();
        System.out.println(solution.solution(7, 3, 4, 1, fares1));
//        System.out.println(solution.solution(6, 4, 5, 6, fares2));
    }
}