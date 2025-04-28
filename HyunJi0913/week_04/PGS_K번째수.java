package week_04;
import java.util.*;
public class PGS_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

            // i~j까지 잘라내기 (주의: i-1부터 j까지)
            int[] temp = Arrays.copyOfRange(array, i - 1, j);

            // 정렬
            Arrays.sort(temp);

            // k번째 숫자 찾기 (주의: k-1 인덱스)
            answer[idx] = temp[k - 1];
        }

        return answer;
    }
}
