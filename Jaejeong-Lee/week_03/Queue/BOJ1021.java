package week_03.Queue;

import java.util.*;

public class BOJ1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        // deque 쓰면 인덱스 쓸 때 형변환 해줘야 해서
        // 그냥 LinkedList로만 사용해서 풂.
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[] nums = new int[m];
        for (int i = 0;i<m;i++){
            nums[i] = sc.nextInt();
        }
        for (int i = 1; i<=n; i++){
            list.offerLast(i);
        }
        int count = 0;
        for (int i = 0 ; i < m; i++){
            int target = nums[i];

            // 왼쪽/오른쪽 회전 여부 결정 기준??? => 인덱스 사용.
            // => LinkedList 사용 (+ Deque)
            int index = list.indexOf(target);
            int size = list.size();
            if ( index <= size/2 ) {
                // 2. 왼쪽 회전 시
                while (list.peekFirst() != target) {
                    int val = list.pollFirst(); // 앞에서 꺼내고 제거 & null 반환
                    count++;
                    list.offerLast(val);
                }
            } else {
                    // 3. 오른쪽 회전 시
                while (list.peekFirst()!= target){
                    int val = list.pollLast();
                    count++;
                    list.offerFirst(val);
                }
            }
            list.pollFirst(); // 타겟 제거
        }
        System.out.println(count);
    }
}

