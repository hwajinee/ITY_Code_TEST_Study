import java.lang.reflect.Array;
import java.util.*;

public class BOJ_1874_스택수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열의 길이
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt(); // 만들고 싶은 수열 입력 받음
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int num = 1; // 1부터 시작해서 push할 숫자
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = sequence[i];

            // 목표 숫자까지 push
            while (num <= target) {
                stack.push(num++);
                result.append("+\n");
            }

            // 스택의 top이 목표 숫자면 pop
            if (stack.peek() == target) {
                stack.pop();
                result.append("-\n");
            } else {
                // 만들 수 없는 경우
                possible = false;
                break;
            }
        }

        // 결과 출력
        if (possible) {
            System.out.print(result);
        } else {
            System.out.println("NO");
        }
    }
}
