import java.io.*;
import java.util.StringTokenizer;

public class BOJ_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        char[] arr = str.toCharArray();

        st = new StringTokenizer(br.readLine());
        int[] min = new int[4];  // 최소 개수
        for (int i = 0; i < 4; i++) {
            min[i] = Integer.parseInt(st.nextToken());
        }

        int[] count = new int[4];  // 현재 윈도우 문자 수
        int result = 0;

        // 초기 윈도우 설정
        for (int i = 0; i < p; i++) {
            if (arr[i] == 'A') count[0]++;
            else if (arr[i] == 'C') count[1]++;
            else if (arr[i] == 'G') count[2]++;
            else if (arr[i] == 'T') count[3]++;
        }

        // 유효한 비밀번호인지 검사
        if (count[0] >= min[0] && count[1] >= min[1] && count[2] >= min[2] && count[3] >= min[3]) {
            result++;
        }

        // 슬라이딩 윈도우 이동
        for (int i = p; i < s; i++) {
            // 오른쪽 문자 추가
            if (arr[i] == 'A') count[0]++;
            else if (arr[i] == 'C') count[1]++;
            else if (arr[i] == 'G') count[2]++;
            else if (arr[i] == 'T') count[3]++;

            // 왼쪽 문자 제거
            char prev = arr[i - p];
            if (prev == 'A') count[0]--;
            else if (prev == 'C') count[1]--;
            else if (prev == 'G') count[2]--;
            else if (prev == 'T') count[3]--;

            // 검사
            if (count[0] >= min[0] && count[1] >= min[1] && count[2] >= min[2] && count[3] >= min[3]) {
                result++;
            }
        }
        System.out.println(result);
    }
}