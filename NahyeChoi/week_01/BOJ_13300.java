package week_01;

import java.util.Scanner;

public class BOJ_13300 {
    public static void main(String[] args) {
        //        N, K 입력 받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] students = new int[6][2];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 2; j++){
                students[i][j] = 0;
            }
        }

//        학생 정보 입력 받기
        for(int i = 0; i < N; i++){
            int gender = sc.nextInt();
            int grade = sc.nextInt();
            if(gender == 0){
                students[grade-1][0] += 1;
            }else{
                students[grade-1][1] += 1;
            }
        }

        int result = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 2; j++){
                result += students[i][j] / K;
                if ( !(students[i][j] % K == 0)){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
