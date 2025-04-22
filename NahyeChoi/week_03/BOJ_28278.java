package week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ_28278 {
    public static void main(String[] args) throws IOException {
//        BOJ 28278
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 명령 수 입력 받기 : N, , 결과 리스트 저장
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> result = new ArrayList<>();
        // stack 선언
        Stack<Integer> stack = new Stack<>();
        // N만큼 반복문
        for (int i = 0; i < N; i++) {
            // 명령 담을 변수와 정수 담을 변수
            String s = br.readLine();
            int num = 0;
            if (s.length() > 1) {
                num = Integer.parseInt(s.split(" ")[1]);
                s = s.split(" ")[0];
            }
            // switch
            switch (s) {
                case "1":
                    stack.push(num);
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        result.add(stack.pop());
                    } else {
                        // -1 출력해야하니 변수 저장
                        result.add(-1);
                    }
                    break;
                case "3":
                    result.add(stack.size());
                    break;
                case "4":
                    if (stack.isEmpty()) {
                        result.add(1);
                    } else {
                        result.add(0);
                    }
                    break;
                case "5":
                    if (!stack.isEmpty()) {
                        result.add(stack.peek());
                    } else {
                        result.add(-1);
                    }
                    break;
            }

        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
