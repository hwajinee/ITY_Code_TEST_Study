package week02;
/*
    문제 : [BOJ-1268] 대칭 차집합

    풀이 방법 : HashSet의 addAll(), retainAll() 메서드를 이용하여 합집합, 차집합 만들기
      1. (AuB의 갯수) - (A교B의 갯수) ✅
      2. (A-B의 갯수) + (B-A의 갯수)

    ❗주의사항 :
    - HashSet 복사
      (X) Set<Integer> newSet = oldSet; // 참조값을 복사하여, 동일한 객체를 가리키게 된다. newSet 변경 시, oldSet도 변경됨.
      (O) Set<Integer> newSet = new HashSet<>(oldSet); // Set의 원소값만 복사하여 새로운 oldSet 객체를 생성해야 한다.
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_1268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for(int i=0; i<A; i++){
            setA.add(sc.nextInt());
        }
        for(int i=0; i<B; i++){
            setB.add(sc.nextInt());
        }

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        int add_size = union.size();

        Set<Integer> insection = new HashSet<>(setA);
        insection.retainAll(setB);
        int size = insection.size();

        System.out.println(add_size - size);

    }
}
