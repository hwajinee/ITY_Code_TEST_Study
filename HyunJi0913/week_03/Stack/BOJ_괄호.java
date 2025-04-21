package week_03.Stack;
import java.util.*;
public class BOJ_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();    // 테스트 케이스 수
        sc.nextLine();           // 개행 문자 제거

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            System.out.println(isVPS(input) ? "YES" : "NO");
        }
    }

    public static boolean isVPS(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {  // ch == ')'
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }// 스택이 비어야 올바른 괄호
}
