package week11.LC_Path_with_Maximum_Probability;

import java.util.*;

/*
    시작 노드에서 도착 노드까지 이동하는 확률의 최댓값 출력
 */
public class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        // 인접리스트 만들기
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double w = succProb[i];

            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        // 다익스트라 알고리즘
        double[] probability = new double[n];
        Arrays.fill(probability, -1);

        Queue<Edge> pq = new PriorityQueue<>(
                (a, b) -> Double.compare(b.prob, a.prob)
        );

        // 시작점 예약
        pq.add(new Edge(start_node, 1));
        probability[start_node] = 1;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            for (Edge next : graph.get(cur.node)) {
                double nextProb = probability[cur.node] * next.prob;
                if (nextProb > probability[next.node]) {
                    pq.add(new Edge(next.node, nextProb));
                    probability[next.node] = nextProb;
                }
            }
        }

        return (probability[end_node] == -1) ? 0 : probability[end_node];
    }

    class Edge {
        int node;
        double prob;

        Edge(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }
}


