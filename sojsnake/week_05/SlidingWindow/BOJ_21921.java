import java.io.*;
import java.util.*;

public class BOJ_21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] days = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            days[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> list = new ArrayList<>();
        int windowSum = 0, maxSum = 0;
        for(int i=0; i<x; i++){
            windowSum += days[i];
        }
        maxSum = windowSum;
        list.add(windowSum);

        for(int i=x; i<days.length; i++){
            windowSum += days[i] - days[i-x];
            maxSum = Math.max(maxSum, windowSum);
            list.add(windowSum);
        }

        if(maxSum == 0) {
            System.out.println("SAD");
            return;
        }
        System.out.println(maxSum);

        int count = 0;
        for(int l : list){
            if(l == maxSum)
                count++;
        }
        System.out.println(count);
    }
}
