package NahyeChoi.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1302 {
    public static void boj_1302() throws IOException {
//        1302 베스트셀러
//        1) 입력 받기 및 사용될 변수들 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> bestSellers = new HashMap<>();
//        2) N만큼 책 입력 받아서 해시맵에 넣기
        for(int i = 0; i < N; i++) {
            String bookName = br.readLine();
            if(bestSellers.containsKey(bookName)) {
                bestSellers.put(bookName, bestSellers.get(bookName) + 1);
            }else{
                bestSellers.put(bookName, 1);
            }
        }
//        3) 출력하기
        int salesCount = Collections.max(bestSellers.values());
        List<String> bestSeller = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : bestSellers.entrySet()) {
            if(entry.getValue() == salesCount) {
                bestSeller.add(entry.getKey());
            }
        }
        Collections.sort(bestSeller);
        System.out.println(bestSeller.get(0));
    }
}
