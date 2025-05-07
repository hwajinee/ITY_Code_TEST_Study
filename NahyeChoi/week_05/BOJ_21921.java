package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_21921 {
    public static void main(String[] args) throws IOException {
//        boj 21921
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        // N일차까지의 방문자 수 입력 받기
        int[] visit = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            visit[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int sum = 0;
        int count = 1;
        // 초기 윈도우 계산
        for (int i = 0; i < X; i++) {
            sum += visit[i];
        }
        max = sum;

        // 슬라이딩 윈도우
        for (int i = X; i < visit.length; i++) {
            sum += visit[i] - visit[i - X];
            if (max < sum) {
                max = sum;
                count = 1;
            } else if (max == sum) {
                count++;
            }
        }

        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
