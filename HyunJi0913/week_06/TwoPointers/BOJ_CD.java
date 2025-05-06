package week_06.TwoPointers;
import java.io.*;
import java.util.*;
public class BOJ_CD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());  // 상근이 CD 수
            int m = Integer.parseInt(st.nextToken());  // 선영이 CD 수

            if (n == 0 && m == 0) break;

            int[] sang = new int[n];
            int[] sun = new int[m];

            for (int i = 0; i < n; i++) {
                sang[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                sun[i] = Integer.parseInt(br.readLine());
            }

            int i = 0, j = 0, count = 0;
            while (i < n && j < m) {
                if (sang[i] == sun[j]) {
                    count++;
                    i++;
                    j++;
                } else if (sang[i] < sun[j]) {
                    i++;
                } else {
                    j++;
                }
            }

            System.out.println(count);
        }
    }
}
