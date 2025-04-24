package week_01;

import java.util.Scanner;

public class BOJ_2738 {
    public static void main(String[] args) {
        //        #2738
        Scanner sc = new Scanner(System.in);

//        N과 M 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();

//       (N*2) * M 행렬 제작
        int[][] arr = new int[N*2][M];
        for(int i = 0; i < N*2; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(sc.next());
            }
        }

//        System.out.println(Arrays.deepToString(arr));

//        첫 줄 + N번 째 줄 더하기
        int[][] result = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                result[i][j] = arr[i][j]+arr[i+N][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(result));
    }
}
