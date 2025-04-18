import java.io.*;
import java.util.*;

public class BOJ_12605_단어순서뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            Stack<String> stack = new Stack<>();
            String[] words = br.readLine().split(" ");

            for (String word : words) {
                stack.push(word);
            }

            System.out.print("Case #" + i + ": ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
                if (!stack.isEmpty()) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
