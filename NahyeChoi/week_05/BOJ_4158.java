package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) { // 여러 개의 테스트 케이스로 이루어져 있기 때문에 while로 감싸줌
            String input = br.readLine();
            //N, M 입력 받기
            int N = Integer.parseInt(input.split(" ")[0]);
            int M = Integer.parseInt(input.split(" ")[1]);

            if (N == 0 && M == 0) {
                break;
            }

            //상근이 CD와 선영이 CD
            int[] sangCD = new int[N];
            for (int i = 0; i < N; i++) {
                sangCD[i] = Integer.parseInt(br.readLine());
            }
            int[] sunCD = new int[M];
            for (int i = 0; i < M; i++) {
                sunCD[i] = Integer.parseInt(br.readLine());
            }

            // 배열 오름차순 정렬X 오름차순으로 주어짐
            //포인터를 상근이랑 선영이로 둔다고 생각
            int count = 0;
            int sangP = 0;
            int sunP = 0;
            while (sangP < N && sunP < M) {
                if (sangCD[sangP] == sunCD[sunP]) {
                    count++;
                    sangP++;
                    sunP++;
                } else if (sangCD[sangP] > sunCD[sunP]) {
                    sunP++;
                } else {
                    sangP++;
                }
            }
            System.out.println(count);

        }

    }
}
