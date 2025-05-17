package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1253 {
    public static void main(String[] args) throws IOException {
//        boj 1253
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int GOOD = 0;
        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;

            while (true) {
                if (start == i) {
                    start++;
                } else if (end == i) {
                    end--;
                }

                if (start >= end) {
                    break;
                }

                int sum = A[start] + A[end];
                if (sum > A[i]) {
                    end--;
                } else if (sum < A[i]) {
                    start++;
                } else {
                    GOOD++;
                    break;
                }
            }
        }
        System.out.println(GOOD);
    }
}
