import java.util.*;
import java.io.*;

public class BOJ_1021_회전하는큐 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 뽑아야 할 숫자 배열
        st = new StringTokenizer(br.readLine());
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int result = 0;

        for (int i = 0; i < m; i++) {
            int target = targets[i];
            int idx = 0;

            // 큐를 리스트로 변환하여 인덱스 계산
            Iterator<Integer> it = queue.iterator();
            while (it.hasNext()) {
                if (it.next() == target) break;
                idx++;
            }

            // 왼쪽 회전과 오른쪽 회전 중 더 적은 횟수 선택
            int half = queue.size() / 2;
            if (idx <= half) {
                // 왼쪽으로 회전
                for (int j = 0; j < idx; j++) {
                    queue.offerLast(queue.pollFirst());
                    result++;
                }
            } else {
                // 오른쪽으로 회전
                for (int j = 0; j < queue.size() - idx; j++) {
                    queue.offerFirst(queue.pollLast());
                    result++;
                }
            }

            // 맨 앞 원소 제거
            queue.pollFirst();
        }

        System.out.println(result);
    }
}
