//원처럼 -> deque

import java.util.*;

public class BOJ_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //사람 수
        int count = sc.nextInt(); //몇 번째 사람이 제거될지
        int m = 1; // 1번 인덱스부터 증가시키면서 count와 비교
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        //1번 for문: deque 완성
        for(int i=0; i<n; i++){
            deque.add(i+1);
        }

        //deque가 비어있지 않은 동안, 
        while(!deque.isEmpty()){
            //현재 인덱스가 제거 순서보다 작으면,
            while(m<count){
                //맨 앞 값을 꺼내서 맨 뒤로 넣고, 인덱스 1 증가
                deque.offerLast(deque.pollFirst());
                m++;
            }
            //제거 순서와 동일하면
            if(m == count){
                //제거하고, list에 저장(나중에 순서 출력 위해)
                list.add(deque.pollFirst());
            }
            //인덱스 1로 초기화
            m = 1;
        }

        System.out.print("<");
        //2번 for문: list 전체 돌면서 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}
