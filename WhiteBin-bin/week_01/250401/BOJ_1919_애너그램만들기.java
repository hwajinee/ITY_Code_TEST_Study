import java.io.*;

public class BOJ_1919_애너그램만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];

        for (char c : br.readLine().toCharArray()) count[c - 'a']++;
        for (char c : br.readLine().toCharArray()) count[c - 'a']--;

        int cnt = 0;
        for (int n : count) cnt += Math.abs(n);

        System.out.println(cnt);
    }
}
