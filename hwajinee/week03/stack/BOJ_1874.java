package week03.stack;
/*
    📝 문제 : [BOJ-1874] 스택 수열

    💡 풀이 방법 :

        문제 이해가 겁나게 안 돼서 다른 사람들 풀이 보고 참고했다 ^^ ...

    ❗ 주의사항 :
 */
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int nextNum = 1;
        boolean isPossible = true;

        while (n-- > 0) {
            int target = Integer.parseInt(sc.nextLine());

            // target까지 push
            while (nextNum <= target) {
                stack.push(nextNum++);
                sb.append("+\n");
            }

            // 스택 top이 target이면 pop
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}
