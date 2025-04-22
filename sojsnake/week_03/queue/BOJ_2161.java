//맨 앞에서 버리고 앞의 수를 맨 뒤로 옮기는 과정 필요 => deque

import java.util.*;

public class BOJ_2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        //1번 for문: 1부터 n까지 넣은 deque 완성
        for(int i=0; i<n; i++){
            deque.add(i+1);
        }
        //deque에 원소 1개만 남을 때까지
        while(deque.size() > 1){
            //첫 번째 수를 빼서 버리고, 버린 카드를 리스트에 넣기(출력을 위해)
            list.add(deque.pollFirst());
            //버린 후 맨 처음에 있는 수 빼서 맨 뒤로 옮기기
            deque.offerLast(deque.pollFirst());
        }
        //2번 for문: list 돌면서 버린 카드 순서대로 출력
        for(int j : list){
            System.out.print(j+" ");
        }
        //마지막에 남게 되는 카드 출력
        System.out.print(deque.peek());
    }
}
