package week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_1021 {
    public static void main(String[] args) throws IOException {
//        BOJ 1021
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        N, M 입력 받는다.
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

//        N 만큼 queue 채우기
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }

        // 타겟 담을 배열 M만큼 선언
        int[] targets = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
//        배열[M] 뽑아낼 자릿수(타겟) 넣기
            targets[i] = Integer.parseInt(st.nextToken());
        }

        // 출력할 결과 담을 변수 : count
        int count = 0;
        // 만약 dq 맨 앞에 들어있는 값이랑 뽑아낼 자릿수랑 같으면 poll()
        for (int i = 0; i < M; i++) {
            int target = targets[i]; //첫 번째 타겟부터..
            int idx = 0;
            // 현재 데크에서 target이 몇 번째에 있는지 찾기
            for (int num : dq) {
                if (num == target) break;
                idx++;
            }

            //앞쪽이 더 가까우면 왼쪽 회전
            if(idx <= dq.size() / 2) {
                while(dq.peekFirst() != target) {
                    dq.offerLast(dq.pollFirst());
                    count++;
                }
            }else{
                while(dq.peekFirst() != target) {
                    dq.offerFirst(dq.pollLast());
                    count++;
                }
            }
            dq.pollFirst();
        } // end of for
        System.out.println(count);
    }
}