package week_07;

import java.io.*;
import java.util.*;


// 시간 초과...
public class BOJ1325 {
    private static ArrayList<Integer> answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 인접리스트 생성
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n ; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int tempA = Integer.parseInt(st.nextToken());
            int tempB = Integer.parseInt(st.nextToken());
            list.get(tempB).add(tempA);
            // A가 B와 신뢰관계
            // = B 해킹 가능하면 A도 해킹 가능
            // = B 해킹 -> A 해킹
        }

        // 최대 해킹 가능 수 체크하기 with BFS
        // i번 컴퓨터의 최대 가능 해킹 수 반환
        int[] maxCount = new int[n+1];
        int max = 0;
        for (int i = 0; i <= n ; i++) {
            maxCount[i] = bfs(i,n,list);
            max = Math.max(max, maxCount[i]);
        }

        // 정답 출력
        for (int i = 0; i <=n ; i++) {
            if (maxCount[i]== max) {
                System.out.print(i + " ");
            }
        }

    }
    public static int bfs(int start, int n, List<List<Integer>> list) {
        // visited 배열 크기 : n+1
        boolean[] visited = new boolean[n+1];
        visited[start] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        int count = 0;

        while(!queue.isEmpty()){
            // 탐색할 노드(컴퓨터) 방문(큐에서 꺼내주기)
            int curr = queue.poll();

            // 다음 노드 방문
            for (int next : list.get(curr) ) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                    count++;
                }
            }
        }
        return count;
    }
}
