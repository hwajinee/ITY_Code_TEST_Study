package week_03.Stack;
import java.util.*;
public class BOJ_오큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>(); // 인덱스 저장용 스택

        for (int i = 0; i < n; i++) {
            // 현재 값이 스택 top의 값보다 크면 -> 오큰수!
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                answer[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        // 스택에 남은 인덱스는 오큰수가 없음 -> -1로 처리
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int num : answer) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
