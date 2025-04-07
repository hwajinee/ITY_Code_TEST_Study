package week_01.배열;
import java.util.*;
public class BOJ_방배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생 수
        int K = sc.nextInt(); // 방당 최대 인원

        int[][] count = new int[2][7]; // [성별][학년], 성별: 0=여, 1=남

        for (int i = 0; i < N; i++) {
            int gender = sc.nextInt(); // 0 or 1
            int student = sc.nextInt();  // 1 ~ 6
            count[gender][student]++;
        }

        int result = 0;

        for (int g = 0; g < 2; g++) {       // 여학생, 남학생
            for (int y = 1; y <= 6; y++) {  // 학년 1 ~ 6
                int students = count[g][y];
                if (students > 0) {
                    result += (students + K - 1) / K; // 올림 계산
                }
            }
        }

        System.out.println(result);

    }
}
