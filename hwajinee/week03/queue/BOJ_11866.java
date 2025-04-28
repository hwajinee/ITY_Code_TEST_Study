package week03.queue;

import java.util.LinkedList;
import java.util.Scanner;

/*
    📝 문제 : [BOJ-11866] 요세푸스 문제 0

    💡 풀이 방법 : linkedlist로 구현하기

        길이가 변하는 리스트에서 index 순환구조 만들 때 ***
        즉, 리스트를 원형으로 생각했을 때, 마지막 인덱스 다음에 다시 맨 처음 인덱스가 오게 하려면?
        => % (나머지 연산자) 이용 !!!

        (current + k - 1) % size
        그리고, index + k가 아닌 index + k - 1 하는 건
        현재 인덱스를 포함하지 않기 때문. 그냥 k를 더하면 현재 사람부터 세는 거라고 한 칸 더 가게 됨.

    ❗ 주의사항 :
 */
public class BOJ_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            ll.add(i+1);
        }
        //      ex) 1 - 2 - 3 - 4 - 5 - 6 - 7   / size : n (= 7)
        // index -> 0   1   2   3   4   5   6

        int k = sc.nextInt();
        int currentIdx = 0;
        StringBuilder sb = new StringBuilder("<");
        for(int i=0; i<n; i++){
            int nextIdx = (currentIdx + k - 1) % ll.size();
            sb.append(ll.remove(nextIdx));
            currentIdx = nextIdx;
            if(i<n-1) sb.append(", ");
        }
        sb.append(">");

        System.out.println(sb.toString());
    }
}
