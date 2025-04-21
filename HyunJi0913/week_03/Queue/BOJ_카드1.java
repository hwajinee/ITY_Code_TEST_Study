package week_03.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_카드1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        // 1부터 N까지 큐에 넣기
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();

        // 카드가 한 장 남을 때까지 반복
        while (queue.size() > 1) {
            sb.append(queue.poll()).append(" "); // 맨 위 카드 버림
            queue.offer(queue.poll());           // 다음 맨 위 카드를 맨 뒤로 이동
        }

        sb.append(queue.poll()); // 마지막 남은 카드

        System.out.println(sb.toString());
    }
}
