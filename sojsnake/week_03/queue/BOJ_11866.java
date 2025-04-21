import java.util.*;

public class BOJ_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        int m = 1;
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            deque.add(i+1);
        }
        while(!deque.isEmpty()){
            while(m<count){
                deque.offerLast(deque.pollFirst());
                m++;
            }
            if(m == count){
                list.add(deque.pollFirst());
            }
            m = 1;
        }

        System.out.print("<");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}
