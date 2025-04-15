package NahyeChoi.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
//        1) N, M 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

//        2) 듣보잡 각각 입력 받기
//        2-1) 듣보잡 선언
        HashMap<String, Integer> who = new HashMap();
        for (int i = 1; i <= N + M; i++) {
            String name = br.readLine();
            if (!who.containsKey(name)) {
                who.put(name, 1);
            } else {
                who.put(name, who.getOrDefault(name, 0) + 1);
            }
        }
        int cnt = 0;
        List<String> noListenNoSee = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : who.entrySet()) {
            if(entry.getValue() == 2) {
                cnt++;
                noListenNoSee.add(entry.getKey());
            }
        }
        Collections.sort(noListenNoSee);
        System.out.println(cnt);
        for(String p : noListenNoSee) {
            System.out.println(p);
        }

//        3) 듣에도 있고, 보에도 있으면 cnt 출력
    }
}
