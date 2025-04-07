package week_01.문자열;
import java.util.*;
public class PGS_단어나누기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        List<String> list = new ArrayList<>();

        for (int i = 1; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String part1 = new StringBuilder(str.substring(0, i)).reverse().toString();
                String part2 = new StringBuilder(str.substring(i, j)).reverse().toString();
                String part3 = new StringBuilder(str.substring(j)).reverse().toString();

                String combined = part1 + part2 + part3;
                list.add(combined);
            }
        }

        Collections.sort(list); // 사전순 정렬
        System.out.println(list.get(0)); // 가장 앞에 있는 게 정답
    }
}
