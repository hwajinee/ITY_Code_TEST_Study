import java.util.*;

public class BOJ_2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0; i<n; i++){
            deque.add(i+1);
        }
        while(deque.size() > 1){
            list.add(deque.pollFirst());
            deque.offerLast(deque.pollFirst());
        }
        for(int j : list){
            System.out.print(j+" ");
        }
        System.out.print(deque.peek());
    }
}
