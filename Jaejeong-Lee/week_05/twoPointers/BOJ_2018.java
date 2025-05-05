package week_05.twoPointers;
// 수들의 합5

import java.util.Scanner;

public class BOJ_2018 {
    public static void main(String[] args) {
        // N개 이하의 연속된 자연수 사용
        // 합을 구해서, 합이 N인 경우 count 증가
        // count 출력

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;
        // 연속된 숫자들의 합 만드는 법.
        // 자연수를 N까지 배열로 만들고, left right를 인덱스로 사용해서 누적 더하기?
        int[] array = new int[n];
        for (int i = 1; i <= n ; i++) {
            array[i] += i;
        }

//        for (int i = n; i >= n; i--) {
//            if (sum <= n){
//                sum += i;
//                if (sum )
//            }
//        }





    }
}
