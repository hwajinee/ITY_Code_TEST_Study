import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_2075 {
    public static void main(String[] args) {
        //ArrayList의 reverseOrder로 구현해봤지만 시간초과
        //우선순위 큐: 데이터를 넣고 뺄 수 있고,
        // 가장 작은 값부터 빠짐. 자동 오름차순 정렬
        //-> poll하면 가장 작은 값 제거
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                pq.add(num);

                if (pq.size() > n) {
                    pq.poll();
                }
            }
        }
        System.out.println(pq.peek());
        //peek(): 가장 작은 값 확인
    }
}