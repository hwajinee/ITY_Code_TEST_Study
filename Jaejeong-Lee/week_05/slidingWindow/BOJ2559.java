package week_05.slidingWindow;

import java.util.Scanner;

public class BOJ2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        // 초기값 세팅
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        // 연속 합이 최대인 순간 체크
        while (count + k < n) {
            sum -= arr[count];
            sum += arr[count + k];
            count++;
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}