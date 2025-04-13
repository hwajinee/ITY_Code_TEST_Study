package week01.array;

import java.util.Scanner;

public class BOJ_13300 {
    public static void main(String[] args) {
//        6 x 2 배열을 만든다. (6행 : 1~6학년)(2열 : 성별, 0(여학생) 1(남학생))
        int[][] studentArr = new int[6][2];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int grade = 0, gender = 0 ;
        for(int i=0; i<n; i++){
            gender = sc.nextInt();
            grade = sc.nextInt(); // 1학년 -> 0번째 행
            studentArr[grade-1][gender] += 1;
        }

        int answer = 0;
        for(int i=0; i<studentArr.length; i++){
            for(int j=0; j<studentArr[0].length; j++){
                if ( studentArr[i][j] != 0){
                    if( studentArr[i][j] % k == 0){
                        answer += (studentArr[i][j] / k);
                    } else {
                        answer += (studentArr[i][j] / k) + 1;
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
