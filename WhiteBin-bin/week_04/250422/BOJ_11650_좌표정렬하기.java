import java.util.*;
import java.io.*;

public class BOJ_11650_좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i = 0 ; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) { // 만약 x 좌표가 같으면 y좌표를 비교해서 작은 y가 앞으로 오게한다.
                return Integer.compare(a[1], b[1]);
            } else { // 만약 x 좌표가 다르면 작은 x가 앞으로 오게 한다.
                return Integer.compare(a[0], b[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.print(sb);
    }
}
