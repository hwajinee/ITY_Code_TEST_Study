import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2559_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 초기 윈도우 합 구하기
        int windowSum = 0;
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        // 슬라이딩 윈도우
        for (int i = K; i < N; i++) {
            windowSum = windowSum - arr[i - K] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        // 결과 출력
        System.out.println(maxSum);
    }
}
