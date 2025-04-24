package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int count = 0;
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            for(int a=1; a<n-1; a++){
                for(int b=a+1; b<n; b++){
                    if ((a*a + b*b + m) % (a*b) == 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
}
