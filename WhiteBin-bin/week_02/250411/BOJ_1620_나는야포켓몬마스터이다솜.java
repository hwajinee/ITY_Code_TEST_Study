import java.io.*;
import java.util.*;

public class BOJ_1620_나는야포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 포켓몬 개수
        int m = Integer.parseInt(st.nextToken()); // 문제 개수

        // 이름 -> 번호 매핑
        Map<String, Integer> nameToNum = new HashMap<>();
        // 번호 -> 이름 매핑 (인덱스로 접근)
        List<String> numToName = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            nameToNum.put(name, i + 1);
            numToName.add(name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String query = br.readLine();

            // 숫자인지 판별 (첫 글자가 0~9인지) 입력이 숫자인지 이름인지 구분해서 번호 또는 이름으로 변환한다.
            char firstChar = query.charAt(0);
            if (firstChar >= '0' && firstChar <= '9') {
                int num = Integer.parseInt(query);
                sb.append(numToName.get(num - 1)).append("\n");
            } else {
                sb.append(nameToNum.get(query)).append("\n");
            }
        }

        System.out.print(sb);
    }
}
