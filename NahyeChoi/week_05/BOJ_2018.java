package week_05;

import java.util.Scanner;

public class BOJ_2018 {
    public static void main(String[] args) {
//        boj 2018
        Scanner sc = new Scanner(System.in);
        // N 입력 받기
        int N = sc.nextInt();

        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (start <= (N / 2)){
            if (sum == N) {
                count++;
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else{
                end++;
                sum += end;
            }
        }

        System.out.println(count);
    }
}
