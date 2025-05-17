import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        long result = facto(n);
        System.out.println(result);
    }
    public static long facto(int n) {
        if (n <=0 ) {
            return 1;
        }
        return n * facto(n-1);
    }
}