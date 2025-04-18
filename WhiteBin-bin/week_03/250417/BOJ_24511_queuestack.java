import java.util.*;
import java.io.*;

public class BOJ_24511_queuestack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] typeStr = br.readLine().split(" ");
        String[] valueStr = br.readLine().split(" ");

        Deque<Integer> queue = new ArrayDeque<>();

        // ❗ 뒤에서부터 넣어야 올바른 순서!
        for (int i = N - 1; i >= 0; i--) {
            if (typeStr[i].equals("0")) {
                queue.addLast(Integer.parseInt(valueStr[i]));
            }
        }

        int M = Integer.parseInt(br.readLine());
        String[] inputStr = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int newVal = Integer.parseInt(inputStr[i]);
            queue.addLast(newVal);               // 새로운 값 push
            sb.append(queue.pollFirst()).append(" "); // 앞에서 꺼냄
        }

        System.out.println(sb.toString().trim());
    }
}
