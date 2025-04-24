package week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_12605 {
    public static void main(String[] args) throws IOException {
//        BOJ - 12605번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 전체 케이스 입력 받기 : N
        // 결과값 저장할 배열 선언
        int N = Integer.parseInt(br.readLine());
        String[] result = new String[N];

        // for : N번 만큼 반복
        for (int i = 0; i < N; i++) {
            // 단어 입력 받기
            String words = br.readLine();
            Stack<String> stack = new Stack<>();
            // for 스페이스 구분자로 단어 분리
            for (String w : words.split(" ")) {
                // 스택 넣기
                stack.push(w);
            }
            // pop 출력
            while (!stack.isEmpty()) {
                if (result[i] == null) {
                    result[i] = stack.pop();
                } else {
                    result[i] += " " + stack.pop();
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Case #" + (i + 1) + ": " + result[i]);
        }
    }
}
