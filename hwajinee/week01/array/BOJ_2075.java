package week01.array;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소 힙

        for (int i = 0; i < N * N; i++) {
            int num = sc.nextInt();
            pq.offer(num);
            if (pq.size() > N) {
                pq.poll(); // 가장 작은 수 제거
            }
        }

        System.out.println(pq.peek()); // N번째 큰 수 출력
    }
}
