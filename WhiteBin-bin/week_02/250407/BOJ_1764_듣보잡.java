import java.util.*;
import java.io.*;

public class BOJ_1764_듣보잡 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for(int j = 0; j < m; j++) {
            String name2 = br.readLine();
            map.put(name2, map.getOrDefault(name2, 0) + 1);
            if(map.get(name2) == 2) {
                list.add(name2);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }


    }
}
