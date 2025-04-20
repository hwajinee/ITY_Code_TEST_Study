import java.io.*;
import java.util.*;

public class BOJ_1158_요세푸스문제0 {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 라인에서 N과 K를 공백 기준으로 나누어 파싱
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        String result = "<";

        while (!queue.isEmpty()) {
            // K-1명은 뒤로 이동
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            // K번째 사람 제거
            result += queue.poll();

            if (!queue.isEmpty()) {
                result += ", ";
            }
        }

        result += ">";

        System.out.println(result);
    }
}
