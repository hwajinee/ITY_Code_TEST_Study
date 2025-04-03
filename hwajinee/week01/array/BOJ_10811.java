package week01.array;

// 배열 뒤집기
// 1. 리스트로 변환(Arrays.asList())하고, Collections.reverse() 사용?
// 2. 이 문제는 배열의 일부를 뒤집어야 하므로, reverse()라는 메서드를 새로 정의하고 사용 !

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10811 {
    static void reverse(int[] arr, int start, int end){
        int[] copy = Arrays.copyOf(arr, arr.length);
        int loop = end - start + 1;
        for(int i=0; i<loop; i++){
            arr[(start+i)-1] = copy[(end-i)-1];
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr;
        arr = new int[n];
        // 배열 요소 저장
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        // m번 배열 요소 뒤집기
        for(int i=0; i<m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            reverse(arr, start, end);
        }

        for(int i : arr){
            System.out.print(i + " ");
        }


    }
}

