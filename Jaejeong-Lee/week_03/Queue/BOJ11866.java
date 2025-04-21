package week_03.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BOJ11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int len = sc.nextInt();
        int order = sc.nextInt();

        for (int i = 1; i<=len ;i++){
            deque.add(i);
        }

        int[] result = new int[len];
        int temp;

        for (int k = 0; k<len ; k++) {
            for ( int j = 1; j < order ; j++){
                // removeFirst로 꺼내서 그걸 다시 addLast로 뒤로 보냄.
                temp = deque.removeFirst();
                deque.addLast(temp);
            }
            if (deque.isEmpty()){
                break;
            } else {
                result[k]=deque.removeFirst();
            }
        }

        System.out.print("<");
        for (int i = 0 ; i < len; i++){
            System.out.print(result[i]);
            if (i != len-1){
                System.out.print(", ");
            } else {
                System.out.println(">");
            }
        }
    }
}
