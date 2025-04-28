package week03.queue;
/*
    📝 문제 : [BOJ-1021] 회전하는 큐

    💡 풀이 방법 :

    ❗ 주의사항 :
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<n; i++){
            queue.add(i+1); // 처음 큐의 인덱스를 값으로 저장.
        }

        int currentIdx = 0;
        int targetIdx;
        int count = 0;
        while(m-- > 0){
            targetIdx = ((LinkedList<Integer>)queue).indexOf(sc.nextInt()-1);
            count += Math.min(distanceCalc.leftDistance(queue, currentIdx, targetIdx),
                    distanceCalc.rightDistance(queue, currentIdx, targetIdx));
            ((LinkedList<Integer>)queue).remove(targetIdx);
        }
        System.out.println(count);
    }
}

class distanceCalc {
    static int leftDistance(Queue q, int current, int target){
        if(current > target){
            return current - target;
        } else {
            return q.size() - (target - current);
        }
    }
    static int rightDistance(Queue q, int current, int target){
        if(current > target){
            return q.size() - (current - target);
        } else {
            return target - current;
        }
    }
}
