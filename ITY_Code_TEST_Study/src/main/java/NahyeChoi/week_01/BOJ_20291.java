package NahyeChoi.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_20291 {
    public static void boj_20291() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        파일의 개수 N개 입력
        int N = sc.nextInt();
        HashMap<String, Integer> files = new HashMap<>();

//        파일의 이름이 N개만큼 주어짐
        for (int i = 0; i < N; i++) {
            String fileName = br.readLine();
//        파일의 이름은 알파벳 소문자와 점(.)으로 구성(점은 한 번만 등장)
            String[] file = fileName.split("\\.");

            String extesion = file[1];
            files.put(extesion, files.getOrDefault(extesion, 0) + 1);
        }

//        확장자 이름과
//        확장자가 여러 개 있는 경우, 사전순으로 출력(ASC)
        List<String> keys = new ArrayList<>(files.keySet());
        Collections.sort(keys);

        for(String key : keys) {
            System.out.println(key + " " + files.get(key));
        }
    }
}
