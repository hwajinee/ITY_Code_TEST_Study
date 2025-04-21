package week_03.Stack;
import java.util.*;
public class BOJ_스택수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int current = 1;  // 다음에 push할 숫자

        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = sc.nextInt();

            // push 해야 할 숫자면 push
            while (current <= target) {
                stack.push(current++);
                sb.append("+\n");
            }

            // 스택의 top이 target과 같으면 pop
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                // 불가능한 경우
                possible = false;
                break;
            }
        }

        // 결과 출력
        if (possible) {
            System.out.print(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
