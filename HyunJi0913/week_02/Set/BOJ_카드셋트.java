package week_02.Set;

import java.util.*;

public class BOJ_카드셋트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Set<String> seen = new HashSet<>();
        int p = 0, k = 0, h = 0, t = 0;

        for (int i = 0; i < s.length(); i += 3) {
            String card = s.substring(i, i + 3);

            // 중복 카드 확인
            if (seen.contains(card)) {
                System.out.println("GRESKA");
                return;
            }

            seen.add(card);

            char suit = card.charAt(0);
            switch (suit) {
                case 'P': p++; break;
                case 'K': k++; break;
                case 'H': h++; break;
                case 'T': t++; break;
            }
        }

        // 각 무늬당 잃어버린 카드 수 = 13 - 가진 수
        System.out.println((13 - p) + " " + (13 - k) + " " + (13 - h) + " " + (13 - t));
    }
}
