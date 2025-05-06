import java.util.*;
import java.io.*;

public class BOJ_2003_수들의합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄: N, M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 둘째 줄: 배열 입력 (수들이 한 줄에 다 들어옴)
        int[] arr = new int[N];
        StringTokenizer numTokens = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(numTokens.nextToken());
        }

        // 투 포인터 로직
        int start = 0, end = 0, sum = 0, count = 0;
        while (true) {
            if (sum >= M) {
                sum -= arr[start++];
            } else if (end == N) {
                break;
            } else {
                sum += arr[end++];
            }

            if (sum == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}
