package week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
//        BOJ 1874
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력 받기
        int n = Integer.parseInt(br.readLine());
        // stack 선언
        Stack<Integer> stack = new Stack<>();
        // result 선언
        ArrayList<String> result = new ArrayList<>();
        int start = 1; // 1부터 시작
        // for문
        for (int i = 0; i < n; i++) {
            // 정수 입력 받기
            int num = Integer.parseInt(br.readLine());
            while (start <= num) {
                stack.push(start);
                start++;
                result.add("+");
            }
            if (stack.peek() == num) {
                stack.pop();
                result.add("-");
            } else {
                System.out.println("NO");
                return;
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
