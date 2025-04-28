package week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Queue<Integer> queue = new LinkedList<>();
        int back = 0;

        // switch-case 문 사용해보기
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            String[] strArr = s.split(" ");
            String cmd = strArr[0];

            if( cmd.equals("push") ){
                queue.add(Integer.parseInt(strArr[1]));
                back = Integer.parseInt(strArr[1]);
            } else if( cmd.equals("pop")) {
                if( !queue.isEmpty()){
                    System.out.println(queue.poll());
                } else {
                    System.out.println("-1");
                }
            } else if( cmd.equals("size")){
                System.out.println(queue.size());
            } else if( cmd.equals("empty")) {
                System.out.println(queue.isEmpty());
            } else if(cmd.equals(" front")){
                if( !queue.isEmpty()){
                    System.out.println(queue.peek());
                } else {
                    System.out.println("-1");
                }
            } else if( cmd.equals("back")){
                if( !queue.isEmpty()){
                    System.out.println(back);
                } else {
                    System.out.println("-1");
                }
            }
        }
    }
}
