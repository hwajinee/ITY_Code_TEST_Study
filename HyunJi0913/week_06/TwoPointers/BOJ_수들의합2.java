package week_06.TwoPointers;
import java.util.*;
public class BOJ_수들의합2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열 크기
        int m = sc.nextInt(); // 목표 합

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = 0, sum = 0, count = 0;

        while (true) {
            if (sum >= m) {
                sum -= arr[left++];
            } else if (right == n) {
                break;
            } else {
                sum += arr[right++];
            }

            if (sum == m) {
                count++;
            }
        }

        System.out.println(count);
    }

}
