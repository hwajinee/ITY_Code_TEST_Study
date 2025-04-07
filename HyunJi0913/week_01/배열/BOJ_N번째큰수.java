package week_01.배열;

import java.util.*;
//런타임 에러
public class BOJ_N번째큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N * N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                nums[i * N + j] = sc.nextInt();
            }
        }

        Arrays.sort(nums);
        System.out.println(nums[nums.length - N]);
    }
}
