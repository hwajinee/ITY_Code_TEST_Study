//A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수 -> 부분합 구하기. 구간 크기 정해져 있지 않음

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        //arr 배열에 값 넣어서 수열 만들기
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left =0, right=0, sum=0, count=0;
        //right는 배열의 처음부터 끝까지 이동
        while(right < arr.length){
            //배열 처음부터 하나씩 추가
            sum += arr[right];
            //구하려는 값보다 크면, 젤 왼쪽 값 제거하고 left를 하나 오른쪽으로 이동
            while(sum > m){
                sum -= arr[left];
                left++;
            }
            //구하려는 값과 일치하면 count 증가
            if(sum == m) {
                count++;
            }
            //right 오른쪽으로 이동
            right++;
        }
        System.out.println(count);
    }
}
