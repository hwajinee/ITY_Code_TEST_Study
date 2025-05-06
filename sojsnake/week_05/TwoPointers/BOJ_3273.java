import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        int m = Integer.parseInt(br.readLine());

        int left=0, right=n-1, count=0;
        while(left<right){
            int sum = num[left] + num[right];
            if(sum == m) {
                count++;
                left++;
                right--;
            }
            else if(sum < m)
                left++;
            else right--;
        }
        System.out.println(count);
    }
}
