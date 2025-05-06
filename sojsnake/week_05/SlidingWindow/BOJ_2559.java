import java.io.*;
import java.util.*;

public class BOJ_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0, windowSum = 0;

        //초기 윈도우 계산
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for(int i=k; i<arr.length; i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }
}
