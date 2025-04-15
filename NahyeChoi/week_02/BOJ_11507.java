package week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_11507 {
    public static void main(String[] args) throws IOException {
//        카드셋트
//        현재 가지고 있는 카드 이름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
//        카드 구분(split)
        HashSet<String> cards = new HashSet<>();
        for (int i = 0; i < input.length(); i += 3) {
            String card = input.substring(i, i + 3);
            if (cards.contains(card)) {
                System.out.println("GRESKA");
                return;
            }
            cards.add(card);
        }

        // 무늬별 개수 세기
        int[] count = new int[4]; // P, K, H, T
        for (String card : cards) {
            char suit = card.charAt(0);
            switch (suit) {
                case 'P': count[0]++; break;
                case 'K': count[1]++; break;
                case 'H': count[2]++; break;
                case 'T': count[3]++; break;
            }
        }
        // 출력
        for (int i = 0; i < 4; i++) {
            System.out.print((13 - count[i]) + " ");
        }
    }
}
