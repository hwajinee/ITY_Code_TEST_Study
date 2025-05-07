package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // N, M 입력 받기
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 수열 입력 받기
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 투 포인터
        int start = 0;
        int end = 0;
        int count = 0;
        int sum = 0;
        while (true) {
            if (sum >= M) {
                sum -= A[start];
                start++;
            }else if (end == N){
                break;
            }else{
                sum += A[end];
                end++;
            }
            if (sum == M) {
                count++;
            }
        }
        System.out.println(count);
    }
}
