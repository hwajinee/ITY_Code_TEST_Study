package week_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_11650 {
    public static void main(String[] args) throws IOException {
//        BOJ 11650
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 점의 개수 N 입력 받기
        int N = Integer.parseInt(br.readLine());
        // 2차원 배열 선언 및 초기화
        int[][] arrXY = new int[N][2];
        for (int i = 0; i < N; i++){
            String input = br.readLine();
            arrXY[i][0] = Integer.parseInt(input.split(" ")[0]);
            arrXY[i][1] = Integer.parseInt(input.split(" ")[1]);
        }

        // Arrays.sort 람다식 사용하여 x-> y 정렬
        Arrays.sort(arrXY, (e1, e2) -> {
            if(e1[0] == e2[0]){
                return Integer.compare(e1[1], e2[1]);
            }else{
                return Integer.compare(e1[0], e2[0]);
            }
        });

        // 출력
        for(int i = 0; i < N; i++){
            System.out.println(arrXY[i][0] + " " + arrXY[i][1]);
        }
    }
}
