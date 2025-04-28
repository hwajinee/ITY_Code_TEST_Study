package week03.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
/*
    ❌ 시간초과 ❌ ????? 중첩문 해결해서 다시 푼건데 ... 이것도 ...???
    📝 문제 : [BOJ-24511] queuestack

    💡 풀이 방법 :
        stack은 고려할 필요 없으므로,
        여러 개의 큐를 하나로 연결된 것처럼 생각할 수 있음 !!!!!! 개쩐ㄷㅏ 와우 진짜 대박 ...
 */
public class BOJ_24511_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] type = new int[n];
        for (int i = 0; i < n; i++) {
            type[i] = sc.nextInt(); // 0: queue, 1: stack
        }

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        // 큐(0)인 애들만 저장할 Deque
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (type[i] == 0) {
                deque.addFirst(values[i]);
            }
        }

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int input = sc.nextInt();
            deque.addLast(input);
            sb.append(deque.pollFirst());
            if (i != m - 1) sb.append(" ");
        }

        System.out.println(sb);

    }
}
