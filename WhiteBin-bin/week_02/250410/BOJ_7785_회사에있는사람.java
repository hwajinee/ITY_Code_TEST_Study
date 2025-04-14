import java.io.*;
import java.util.*;

public class BOJ_7785_회사에있는사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> people = new HashSet<>();

        // 출입 기록 처리
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String action = input[1];

            if (action.equals("enter")) {
                people.add(name); // 출근: 집합에 추가
            } else {
                people.remove(name); // 퇴근: 집합에서 제거
            }
        }

        // 남아있는 사람 이름들을 리스트로 변환 후 정렬
        List<String> remainList = new ArrayList<>(people);
        Collections.sort(remainList, Collections.reverseOrder()); // 역순 정렬

        // 출력
        for (String name : remainList) {
            System.out.println(name);
        }
    }
}