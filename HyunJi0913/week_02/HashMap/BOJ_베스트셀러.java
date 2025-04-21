package week_02.HashMap;

import java.util.*;

public class BOJ_베스트셀러 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 책 개수
        sc.nextLine(); // 개행 문자 제거

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String title = sc.nextLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }

        int max = 0;
        String bestSeller = "";

        for (String key : map.keySet()) {
            int count = map.get(key);
            // 판매 수가 더 많거나, 같을 경우 사전 순으로 앞서는 책을 선택
            if (count > max || (count == max && key.compareTo(bestSeller) < 0)) {
                max = count;
                bestSeller = key;
            }
        }

        System.out.println(bestSeller);
    }
}
