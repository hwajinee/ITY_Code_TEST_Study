package week11.PGS_등산코스_정하기;

import java.util.*;

public class Solution {
    static class Edge {
        int node, cost;
        Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static class State implements Comparable<State> {
        int node, intensity;
        State(int node, int intensity) {
            this.node = node;
            this.intensity = intensity;
        }
        @Override
        public int compareTo(State o) {
            return this.intensity - o.intensity;
        }
    }

    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        // 인접 리스트 구성
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int[] path : paths) {
            int u = path[0], v = path[1], w = path[2];
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        // summits 빠른 조회 위해 Set 사용
        Set<Integer> summitSet = new HashSet<>();
        for (int summit : summits) summitSet.add(summit);

        // 다익스트라: 모든 게이트에서 시작
        int[] intensity = new int[n + 1];
        Arrays.fill(intensity, Integer.MAX_VALUE);

        PriorityQueue<State> pq = new PriorityQueue<>();
        for (int gate : gates) {
            pq.offer(new State(gate, 0));
            intensity[gate] = 0;
        }

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            int now = cur.node;
            int cost = cur.intensity;

            if (intensity[now] < cost) continue;
            if (summitSet.contains(now)) continue;  // 산봉우리는 더 이상 진행하지 않음

            for (Edge next : graph.get(now)) {
                int nextNode = next.node;
                int newCost = Math.max(cost, next.cost);

                if (intensity[nextNode] > newCost) {
                    intensity[nextNode] = newCost;
                    pq.offer(new State(nextNode, newCost));
                }
            }
        }

        // 정답 추출
        Arrays.sort(summits);
        int minIntensity = Integer.MAX_VALUE;
        int answerSummit = 0;

        for (int summit : summits) {
            if (intensity[summit] < minIntensity) {
                minIntensity = intensity[summit];
                answerSummit = summit;
            }
        }

        return new int[]{answerSummit, minIntensity};
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] paths = {
                {1, 2, 3}, {2, 3, 5}, {2, 4, 2}, {2, 5, 4},
                {3, 4, 4}, {4, 5, 3}, {4, 6, 1}, {5, 6, 1}
        };
        int[] gates = {1, 3};
        int[] summits = {5};

        Solution sol = new Solution();
        int[] result = sol.solution(n, paths, gates, summits);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
