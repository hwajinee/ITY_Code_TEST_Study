import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = sc.nextInt();
        int result = 0;
        //index 값을 사용하기 위해서 LinkedList로 구현(indexOf 사용 가능해짐)
        LinkedList<Integer> deque = new LinkedList<>();

        //1번 for문: deque 완성
        for(int i=0; i<size; i++){
            deque.add(i+1);
        }

        //2번 for문: 뽑으려는 수와 비교해서 연산 수행
        for(int i=0; i<count; i++){
            int target = sc.nextInt();
            int idx = deque.indexOf(target);
            int half_idx = deque.size()/2;

            //getFirst는 큐가 비었을 때 예외 처리함.
            //peekFirst는 처리하지 않음
            //큐의 첫 값이 target값이 아닌 동안 연산 수행
            while(deque.getFirst() != target){
                //idx가 절반 기준 왼쪽 부분에 위치하면
                if(idx <= half_idx){
                    //맨 앞 값을 맨 뒤로 보내기
                    int front = deque.pollFirst();
                    deque.addLast(front);
                    result++;
                }
                //idx가 오른쪽 부분에 위치하면
                else{
                    //맨 뒷 값을 맨 앞으로 보내기
                    int back = deque.pollLast();
                    deque.addFirst(back);
                    result++;
                }

            }
            //큐의 첫 값이 target값이므로 첫 값 뽑아내기
            deque.pollFirst();
        }
        System.out.println(result);
    }
}
