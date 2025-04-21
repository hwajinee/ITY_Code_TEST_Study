package week_01.배열;

import java.util.Scanner;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //바구니 개수
        int m = sc.nextInt(); // 역순 바꾸는 횟수

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for ( int z = 0; z < m; z++) {
            int i = sc.nextInt() -1;
            int j = sc.nextInt() -1;

            while ( i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for ( int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//        <내 풀이>
//        int [] arr1 = new int[n];
//        int [] arr2 = new int[n];
//        for ( int i = 0 ; i < n ; i++) {
//            arr1[i] = i+1;
//            arr2[i] = arr1[i];
//        }
////      여기까지 일단 1차원 배열 arr1에 12345 넣어줌.
//// 이제 1 2 입력 받고 바꿔줄 차례
//        while (true) {
//            int num1 = sc.nextInt();
//            int num2 = sc.nextInt();
//            int n2 = num2 / 2;
//            int count = 0;
//
//            for ( int i = num1-1 ; i < n2 ; i++) {
////            여기서 1번째,인덱스0부터 2번째,인덱스1까지 바꿔주는 코드 작성
//                arr1[i] = arr2[n2-1];
//            }
//            count++;
//            if (count == m) break;
//        }
//    }
//}

