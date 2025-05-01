import java.io.*;

public class BOJ_4158_CD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 두 배열 A와 B가 정렬되어 있다는 전제하에 시작하는데 A[i]와 B[j]를 비교하여
        // 같으면 공통 CD이므로 Count를 증가시키고 두 포인터 모두 이동 A만 작으면 a의 포인터만 이동,
        // B만 작으면 B의 포인터만 이동
        while (true) {
            String line = br.readLine();
            if (line == null || line.equals("0 0")) break;

            String[] nm = line.split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            int[] A = new int[n];
            int[] B = new int[m];

            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                B[i] = Integer.parseInt(br.readLine());
            }

            int i = 0, j = 0, count = 0;

            while (i < n && j < m) {
                if (A[i] == B[j]) {
                    count++;
                    i++; j++;
                } else if (A[i] < B[j]) {
                    i++;
                } else {
                    j++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}
