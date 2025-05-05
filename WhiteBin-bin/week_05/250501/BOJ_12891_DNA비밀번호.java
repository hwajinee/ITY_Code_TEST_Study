import java.util.*;
import java.io.*;

public class BOJ_12891_DNA비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        int[] required = new int[4]; // A, C, G, T 최소 조건
        int[] current = new int[4];  // 현재 윈도우 내 개수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            required[i] = Integer.parseInt(st.nextToken());
        }

        // 초기 윈도우 구성
        for (int i = 0; i < p; i++) {
            char c = str.charAt(i);
            if (c == 'A') {
                current[0]++;
            }
            else if (c == 'C') {
                current[1]++;
            }
            else if (c == 'G') {
                current[2]++;
            }
            else if (c == 'T') {
                current[3]++;
            }
        }
        int count = 0;

        // 초기 윈도우 조건 검사(최소 개수인지 확인하는 검사)
        if (current[0] >= required[0] && current[1] >= required[1] &&
                current[2] >= required[2] && current[3] >= required[3]) {
            count++;
        }

        // 슬라이딩 윈도우
        for (int i = p; i < s; i++) {
            char remove = str.charAt(i - p);
            char add = str.charAt(i);

            // 제거 문자 반영
            if (remove == 'A') {
                current[0]--;
            }
            else if (remove == 'C') {
                current[1]--;
            }
            else if (remove == 'G') {
                current[2]--;
            }
            else if (remove == 'T') {
                current[3]--;
            }

            // 추가 문자 반영
            if (add == 'A') {
                current[0]++;
            }
            else if (add == 'C') {
                current[1]++;
            }
            else if (add == 'G') {
                current[2]++;
            }
            else if (add == 'T') {
                current[3]++;
            }

            // 조건 검사 (최소 개수인지 확인하는 검사)
            if (current[0] >= required[0] && current[1] >= required[1] &&
                    current[2] >= required[2] && current[3] >= required[3]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
