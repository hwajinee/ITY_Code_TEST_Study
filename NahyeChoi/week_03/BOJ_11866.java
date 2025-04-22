package week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
//        BOJ 11866
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 사람수 입력 받기 : N
        int N = Integer.parseInt(input.split(" ")[0]);
        // 양의 정수 입력 받기 : K
        int K = Integer.parseInt(input.split(" ")[1]);

        // queue 선언, result 선언
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // queue 초기화
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 큐의 크기가 1보다 크거나 같을 때까지만 반복
        while (queue.size() >= 1) {
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll()); // 앞에서 꺼내서 다시 뒤에 넣기
            }
            result.add(queue.poll());
        } // end of while

        // 출력
        String output = "<";
        for (int i = 0; i < result.size(); i++) {
            output += result.get(i);
            if (i != result.size() - 1) {
                output += ", ";
            }
        }
        output += ">";

        System.out.println(output);
    }
}