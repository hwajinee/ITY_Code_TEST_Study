package week07.BOJ_18352_특정_거리의_도시_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    bfs를 이용한다.
    출발 노드에서 bfs로 그래프를 순회할 때, 거리도 함께 카운팅한다.
    예를 들어, 최단거리가 2인 노드를 찾는다면 bfs 순회 중 최단거리가 3인 노드를 발견한 즉시
    프로그램을 종료한다.
    int count : 이동거리를 카운팅
    int[] nodes : 현재 count값을 이동거리로 하는 노드 번호
                  nodes는 count값이 증가했을 때, 전체 초기화하고 다시 채운다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // N: 노드 개수
        int M = Integer.parseInt(st.nextToken()); // M: 도로 개수
        int K = Integer.parseInt(st.nextToken()); // K: 최단거리
        int X = Integer.parseInt(st.nextToken()); // X: 출발 노드

        // graph 인접리스트 만들기
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<N; i++){
            graph.put(i+1, new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }

        // bfs
        Deque<int[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[N];

        // 최단거리별 노드번호를 저장할 리스트
        List<List<Integer>> answer = new ArrayList<>();
        for(int distance=0; distance<=M; distance++){ // 최대 거리는 도로의 개수인 M
            answer.add(distance,new ArrayList<>());
        }

        queue.add(new int[]{X, 0});
        visited[X-1] = true;
        // 최단거리가 0인 1번 노드 기록
        answer.get(0).add(1);

        while(!queue.isEmpty()){
            int[] curVertex = queue.pop();
            for(int nextVertex : graph.get(curVertex[0])) {
                if(!visited[nextVertex-1]) {
                    queue.add(new int[]{nextVertex, curVertex[1] + 1});
                    visited[nextVertex-1] = true;
                    // 최단거리가 curVertex[1] + 1인 nextVertex번 노드 기록
                    answer.get(curVertex[1] + 1).add(nextVertex);
                }
            }
        }

        // 오름차순 정렬 후 출력
        if(answer.get(K).isEmpty()){
            System.out.println(-1);
        } else {
            List<Integer> result = answer.get(K);
            Collections.sort(result);
            for(int n : result)
            System.out.println(n);
        }

    }
}
