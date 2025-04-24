package week_02.HashMap;

import java.util.HashMap;

public class PGS_완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 목록: 이름별로 개수 저장
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주자 목록: 이름별로 개수 줄이기
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 개수가 1 이상 남은 사람 = 완주 못한 사람
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }

        return ""; // 예외는 없음
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion)); // mislav
    }
}
