package week03.queue;

import java.util.*;

/*
    ❌ 시간초과 ❌
    📝 문제 : [BOJ-24511] queuestack

    💡 풀이 방법 :
        stack, queue를 담는 배열을 생성하려고 했음. -> 못품 ^^
        * 문제에서 스택과 큐는 단 하나의 자료만 저장할 수 있다고 함.
          -> 스택, 큐 객체를 만들 필요 없이 배열로 해결.

        => 가로가 n, 세로가 2 인 int형 2차원 배열 생성
           int[*][] - 0(큐) 또는 1(스택)
           int[][*] - 원소값 저장.

           삽입할 원소를 value로 받고,
           이차원배열의 int[*][]을 순회화며, 큐/스택 여부 파악
           - 큐 ) 기존 원소와 value값을 교환
           - 스택 ) value값이 들어오고 그대로 나오므로, 따로 처리할 것 없음.

    ❗ 주의사항 : 시간초과 ...
 */
public class BOJ_24511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] queuestack = new int[n][2];

        for(int i=0; i<n; i++){
            queuestack[i][0] = sc.nextInt();
        }
        sc.nextLine();

        for(int i=0; i<n; i++){
            queuestack[i][1] = sc.nextInt();
        }
        sc.nextLine();

        int m = Integer.parseInt(sc.nextLine());
        for(int i=0; i<m; i++){
            int value = sc.nextInt();
            for(int j=0; j<n; j++) {
                if (queuestack[j][0] == 0){ // queue이면, value와 기존 원소값을 교체한다.
                    int temp = queuestack[j][1];
                    queuestack[j][1] = value;
                    value = temp;
                }
                // 스택일 때는 배열과 value값 모두 변화가 없으므로 따로 코드 작성할 필요 없음.
            }
            System.out.println(value);
        }
    }
}
