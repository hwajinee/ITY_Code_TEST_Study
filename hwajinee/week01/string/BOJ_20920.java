package week01.string;

import java.util.*;
import java.util.Scanner;

/*
    1. 빈도수가 높은 문자열
    2. 길이가 긴 문자열
    3. 사전 순으로 앞선 문자열 (String.compareTo() : 문자열의 사전)

 */
public class BOJ_20920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            if(s.length() < m) continue;
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 자주 등장하는 단어 순서대로 정렬
                if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
                    return Integer.compare(map.get(o2), map.get(o1));
                }
                // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 등장 횟수와 길이가 같으면 사전 순으로 정렬
                return o1.compareTo(o2);
            }
        });

        // 정렬된 단어들을 출력
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}