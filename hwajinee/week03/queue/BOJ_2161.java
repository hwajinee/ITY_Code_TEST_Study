package week03.queue;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/*
    📝 문제 : [BOJ-2161] 카드1

    💡 풀이 방법 : Deque를 이용한다.
                front에서부터 1, 2, ... , n 을 저장하고,
                1. pollFirst()한 값을 출력문에 추가
                2. pollFirst() -> addLast()
                1,2를 반복하다가 Deque의 size가 1이 되면
                마지막 원소를 출력문에 추가한 뒤, 출력 및 종료 ~!

    ❗ 주의사항 :
 */
public class BOJ_2161 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++)
        {
            queue.add(i+1);
        }

        StringBuilder sb = new StringBuilder("");
        while(queue.size() > 1){
            sb.append(queue.pollFirst()+" ");
            queue.addLast(queue.pollFirst());
        }
        sb.append(queue.pollFirst());
        System.out.println(sb.toString());
    }
}
