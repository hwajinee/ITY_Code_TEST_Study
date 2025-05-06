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
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left =0, right=0, sum=0, count=0;
        while(right < arr.length){
            sum += arr[right];
            while(sum > m){
                sum -= arr[left];
                left++;
            }
            if(sum == m) {
                count++;
            }
            right++;
        }
        System.out.println(count);
    }
}
