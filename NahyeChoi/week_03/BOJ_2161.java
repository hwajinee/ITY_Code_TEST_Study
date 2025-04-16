package week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        카드 개수 입력 받기 : N
        int N = Integer.parseInt(br.readLine());
//        Queue 선언
        Queue<Integer> cards = new LinkedList<>();

//        Queue cards 카드 숫자 삽입
        for(int i = 1; i <= N; i++) {
            cards.add(i);
        }

//        1) 맨 위 숫자 삭제
//        2) 그 다음 숫자는 밑으로 이동
//        큐에 값이 있는 동안 계속 반복
        while(!cards.isEmpty()) {
//            cards 맨 앞에 있는 요소 삭제 및 출력
            System.out.print(cards.remove() + " ");
//            만약 cards에 요소가 없다면, break로 반복문 종료
            if(cards.isEmpty()) {
                break;
            }
//            1) cards 맨 앞에 있는 요소를 맨 뒤로 삽입
            cards.add(cards.peek());
//            2) 삽입 후 맨 앞에 있는 요소 지우기
            cards.remove();
        }
    }
}
