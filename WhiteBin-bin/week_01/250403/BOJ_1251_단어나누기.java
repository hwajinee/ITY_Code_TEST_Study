import java.io.*;
import java.util.*;

public class BOJ_1251_단어나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        List<String> list = new ArrayList<>();

        for(int i=1; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder(str.substring(0, i));
                StringBuilder sb2 = new StringBuilder(str.substring(i, j));
                StringBuilder sb3 = new StringBuilder(str.substring(j));
                sb.append(sb1.reverse()).append(sb2.reverse()).append(sb3.reverse());
                list.add(String.valueOf(sb));
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));


    }

}