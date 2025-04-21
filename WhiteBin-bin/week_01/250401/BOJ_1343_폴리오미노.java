import java.io.*;

public class BOJ_1343_폴리오미노 {
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int count = 0;

        for (char temp : str.toCharArray()) {
            if (temp == 'X') count++;
            else {
                if (!fillPolyomino(count)) break;
                answer.append(".");
                count = 0;
            }
        }

        if (!answer.toString().equals("-1") && !fillPolyomino(count)) answer.setLength(0);

        bw.write(answer.length() == 0 ? "-1" : answer.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static boolean fillPolyomino(int count) {
        while (count >= 4) {
            answer.append("AAAA");
            count -= 4;
        }
        if (count == 2) {
            answer.append("BB");
        } else if (count != 0) {
            answer.setLength(0);
            answer.append("-1");
            return false;
        }
        return true;
    }
}
