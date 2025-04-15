package week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
//        1) 입력 받기(입력 받을 숫자의 개수는 총 10개)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> numbers = new HashMap();

//        2) number % 42 결과 key로 넣기
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine())%42;
            if (!numbers.containsKey(number)) {
                numbers.put(number, 1);
            } else {
                numbers.put(number, numbers.getOrDefault(number, 0) + 1);
            }
        }

//        3) 키 개수 출력
        int cnt = 0;
        for(Integer key : numbers.keySet()) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
