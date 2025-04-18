import java.util.*;
import java.io.*;

public class BOJ_9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 테스트 케이스 개수

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            // 다 돌고 나서 스택이 비어 있어야 올바른 괄호
            if (!stack.isEmpty()) isValid = false;

            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
