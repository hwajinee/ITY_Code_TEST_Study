package week03.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1021_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // queue의 크기
        int m = sc.nextInt(); // 제거할 원소의 개수
        sc.nextLine();

        Deque<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.add(i+1);
        }

        int count = 0;
        for(int i=0; i<m; i++){
            int half = q.size() / 2;
            int targetNum = sc.nextInt();
            int idx = ((LinkedList<Integer>)q).indexOf(targetNum);

            if(idx >= half){
                count += q.size() - idx;
                while(count-- > 0){
                    q.addFirst(q.removeLast());
                }
                System.out.println(q.removeLast());
            } else {
                count += idx;
                while(count-- > 0){
                    q.addLast(q.removeFirst());
                }
                System.out.println(q.removeFirst());
            }
        }
        System.out.println(count);

    }
}
