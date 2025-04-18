package week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        1) 데이터 T 입력 받기
        int T = Integer.parseInt(br.readLine());
//        2) 스택 선언
        Stack<String> stack = new Stack<>();
//        결과값 저장 배열
        String[] result = new String[T];
//        T만큼 반복
        for (int i = 0; i < T; i++) {
            // 문자열 순회
            for (String s : br.readLine().split("")) {
                // 열린 괄호 처리
                if (s.equals("(")) {
                    stack.push(s);
                } else { // 닫힌 괄호 처리
                    // 스택 비었으면 NO
                    if(stack.isEmpty()) { result[i] = "NO"; break; }
                    // top이 열린 괄호면 pop()
                    stack.pop();
                }
                if(stack.isEmpty()) { result[i] = "YES";}
                else { result[i] = "NO";}
            }
            // 순회 한번 끝날 때마다 스택 초기화
            stack.clear();
        }
        for(String s : result){
            System.out.println(s);
        }
    }
}
