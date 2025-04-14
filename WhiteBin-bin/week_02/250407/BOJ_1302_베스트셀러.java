import java.util.*;
import java.io.*;


public class BOJ_1302_베스트셀러 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        List<String> keyList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        int max = 0;
        for(String a : map.keySet()) {
            max = Math.max(max, map.get(a));
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(max)) {
                keyList.add(entry.getKey());
            }
        }
        Collections.sort(keyList);
        System.out.println(keyList.get(0));
    }
}
