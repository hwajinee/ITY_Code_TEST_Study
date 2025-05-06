import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n==0 && m==0) break;

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            int idx1 = 0;
            int idx2 = 0;
            int count = 0;

            while (idx1<n && idx2 <m) {
                if (arr1[idx1] == arr2[idx2]) {
                    count++;
                    idx1++;
                    idx2++;
                } else {
                    if (arr1[idx1] < arr2[idx2]) {
                        idx1++;
                    } else {
                        idx2++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}