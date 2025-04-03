import java.io.*;
import java.util.*;
import java.lang.*;



public class BOJ_20291_파일정리 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            int index = s.indexOf('.');
            String str = s.substring(index + 1);
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        Set<String> strings = map.keySet();
        List<String> list = new ArrayList<>(strings);
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)+" "+map.get(list.get(i)));
        }
    }
}

