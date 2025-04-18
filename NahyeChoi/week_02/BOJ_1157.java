package week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        단어 입력 받기
        String word = br.readLine().toUpperCase();
//        알파벳 맵에 넣기
        HashMap<String, Integer> alphabetMap = new HashMap<>();
        for (String alphabet : word.split("")) {
            alphabetMap.put(alphabet, alphabetMap.getOrDefault(alphabet, 0) + 1);
        }
//        max
        int max = Collections.max(alphabetMap.values());
        int cnt = 0;
        String result = "";
        for (Map.Entry<String, Integer> entry : alphabetMap.entrySet()) {
            if (entry.getValue() == max) {
                cnt++;
                result = entry.getKey();
            }
        }
        System.out.println(cnt>1? "?":result);
    }
}
