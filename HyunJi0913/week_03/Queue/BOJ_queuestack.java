package week_03.Queue;
import java.util.*;
public class BOJ_queuestack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N
        int k = sc.nextInt(); // K

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {
            // K-1번까지는 맨 앞에서 꺼내서 뒤로 보내기
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }

            // K번째는 제거
            sb.append(queue.poll());
            if (!queue.isEmpty()) sb.append(", ");
        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}
