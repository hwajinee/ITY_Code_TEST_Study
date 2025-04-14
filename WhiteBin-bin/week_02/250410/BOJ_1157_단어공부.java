import java.io.*;
import java.util.*;

public class BOJ_1157_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase(); // 대문자로 통일해서 처리

        HashMap<Character, Integer> map = new HashMap<>();

        // 단어의 각 알파벳을 하나씩 확인
        for (char ch : word.toCharArray()) {
            // map에 알파벳이 이미 있으면 값 +1, 없으면 1로 추가
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 가장 많이 등장한 알파벳 찾기
        int max = 0;         // 최대 등장 횟수 저장
        char result = '?';   // 정답 알파벳

        // map에 있는 모든 알파벳을 하나씩 확인
        for (char ch : map.keySet()) {
            int count = map.get(ch); // 이 알파벳이 몇 번 나왔는지

            if (count > max) {
                max = count;    // 더 많이 나온 경우 업데이트
                result = ch;    // 해당 알파벳을 정답으로 저장
            } else if (count == max) {
                result = '?';   // 최대값이 여러 개면 ? 처리
            }
        }

        System.out.println(result);
    }
}
