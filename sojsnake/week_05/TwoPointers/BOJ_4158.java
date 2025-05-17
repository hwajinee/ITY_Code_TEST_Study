import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(br.readLine());
            }

            int i = 0, j = 0, count = 0;

            while (i < n && j < m) {
                if (a[i] < b[j]) {
                    i++;
                } else if (a[i] > b[j]) {
                    j++;
                } else {
                    count++;
                    i++;
                    j++;
                }
            }

            System.out.println(count);
        }
    }
}
