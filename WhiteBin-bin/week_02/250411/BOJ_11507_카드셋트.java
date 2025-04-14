import java.io.*;
import java.util.*;

public class BOJ_11507_카드셋트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 카드 문양에 대한 개수를 셀 배열
        int[] cnt = new int[4];  // P, K, H, T 순서

        // 카드 중복 체크를 위한 HashSet
        HashSet<String> hs = new HashSet<>();

        // 카드 하나씩 처리
        for (int i = 0; i < str.length(); i += 3) {
            String card = str.substring(i, i + 3);

            // 카드가 중복되면 GRESKA 출력하고 종료
            if (!hs.add(card)) {
                System.out.println("GRESKA");
                return;
            }

            // 문양별 카드 개수 카운팅
            switch (card.charAt(0)) {
                case 'P': cnt[0]++; break;
                case 'K': cnt[1]++; break;
                case 'H': cnt[2]++; break;
                case 'T': cnt[3]++; break;
            }
        }

        // 부족한 카드 개수 계산하여 출력
        StringBuilder sb = new StringBuilder();
        for (int c : cnt) {
            sb.append(13 - c).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
