package week_04.seraching;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2798 {
    static int maxSum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n장 카드 주어짐
        int m = sc.nextInt(); // m에 가까운 합 만들어야 함.
        sc.nextLine();

        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        // 카드 3장의 합을 계산 (모든 경우의 수 확인)
        // -> 순열/조합 생성
        // -> M보다 작거나 같은지 판별
        // -> 합이 가장 큰 경우 판별
        // + 재귀 사용
        int maxSum = 0;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < cards.length; i++) {
            if (sum > m){
                continue;
            } else {
                sum = combine(n,m,cards,maxSum,i,count,sum);
            }
        }
        System.out.println(sum);
    }

    public static int combine(int n, int m, int[] cards, int maxSum, int index, int count, int sum){
        // 카드 개수 3개인지 판별
        if (count != 3) {
            // 카드의 총합 m 보다 작거나 같은지 확인
            // 합이 가장 큰 경우 판별
            if (sum <= m){
                sum += cards[index];
                maxSum = Math.max(maxSum, sum);
                count++;
            }
        }
        for (int i = index ; i < n ; i++){
            combine(n,m,cards,maxSum,i+1, count+1, sum + cards[i]);
        }
        return sum;
    }
}