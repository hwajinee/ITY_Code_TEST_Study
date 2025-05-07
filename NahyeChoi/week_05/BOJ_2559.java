package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2559 {
    public static void main(String[] args) throws IOException {
//        BOJ 2559
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 온도 배열
        int[] tem = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tem[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += tem[i];
        }
        int max = sum;

        for (int i = K; i < tem.length; i++) {
            sum += tem[i] - tem[i - K];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
