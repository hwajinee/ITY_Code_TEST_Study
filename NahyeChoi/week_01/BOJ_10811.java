package week_01;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1) N과 M 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();

//        배열 생성 및 데이터 삽입
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = i+1;
        }
//        역순으로 만들 범위와 i, j 입력 받기
        for(int m = 0; m < M; m++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            while(i < j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++; j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
