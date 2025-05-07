package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
//        boj 3273
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 수열의 크기 n
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 정렬

        // 자연수 x
        int x = Integer.parseInt(br.readLine());

        // 투 포인터
        int count = 0;
        int start = 0;
        int end = n - 1;
        while(start < end) {
            int sum = arr[start] + arr[end];
            if (sum == x){
                count++;
                start++;
                end--;
            }else if (sum < x) {
                start++;
            }else {
                end--;
            }
        }

        System.out.println(count);
    }
}
