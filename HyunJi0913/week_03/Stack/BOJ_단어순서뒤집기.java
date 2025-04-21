package week_03.Stack;
import java.util.*;
public class BOJ_단어순서뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());  // 테스트 케이스 수

        for (int i = 1; i <= N; i++) {
            String line = sc.nextLine();         // 한 줄 입력 받기
            String[] words = line.split(" ");    // 단어 단위로 자르기

            // 단어 순서 뒤집기
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i).append(": ");

            for (int j = words.length - 1; j >= 0; j--) {
                sb.append(words[j]);
                if (j > 0) sb.append(" ");
            }

            System.out.println(sb.toString());
        }
    }
}
