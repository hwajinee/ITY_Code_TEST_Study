package week_06.TwoPointers;
import java.util.*;
public class BOJ_두수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();               // 수열의 크기
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();          // 수열 입력
        }

        int x = sc.nextInt();               // 목표 합

        Arrays.sort(arr);                   // 정렬 (투 포인터 전제조건)

        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
                count++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(count);
    }
}
