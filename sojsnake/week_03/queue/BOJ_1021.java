import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = sc.nextInt();
        int result = 0;
        LinkedList<Integer> deque = new LinkedList<>();

        for(int i=0; i<size; i++){
            deque.add(i+1);
        }

        for(int i=0; i<count; i++){
            int target = sc.nextInt();
            int idx = deque.indexOf(target);
            int half_idx = deque.size()/2;

            //getFirst는 큐가 비었을 때 예외 처리함.
            //peekFirst는 처리하지 않음
            while(deque.getFirst() != target){
                if(idx <= half_idx){
                    int front = deque.pollFirst();
                    deque.addLast(front);
                    result++;
                }
                else{
                    int back = deque.pollLast();
                    deque.addFirst(back);
                    result++;
                }

            }
            deque.pollFirst();
        }
        System.out.println(result);
    }
}
