import java.io.*;

public class BOJ_11365_밀비급일 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("END")) break;
            StringBuilder reverse = new StringBuilder(s);
            reverse = reverse.reverse();
            sb.append(reverse + "\n");
        }
        System.out.print(sb);
    }
}