import java.util.*;
import java.io.*;

public class BOJ_2161_카드1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        // 결과를 저장할 StringBuilder (버린 카드 순서)
        StringBuilder result = new StringBuilder();

        while (queue.size() > 1) {
            // 1. 가장 앞의 카드를 버린다.
            result.append(queue.poll()).append(" ");

            // 2. 그 다음 카드를 맨 뒤로 보낸다.
            queue.offer(queue.poll());
        }

        // 마지막 남은 카드
        result.append(queue.poll());

        // 결과 출력
        System.out.println(result.toString());
    }
}
