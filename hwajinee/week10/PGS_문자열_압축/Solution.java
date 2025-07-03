package week10.PGS_문자열_압축;

public class Solution {
    public static int solution(String s) {
        int answer = s.length();

        // 1글자부터 s길이 절반까지 자르는 단위를 반복
        for (int step = 1; step <= s.length() / 2; step++) {
            String compressed = ""; // 압축 결과 문자열
            String prev = s.substring(0, step); // 맨 처음 잘라낸 문자열
            int count = 1;

            for (int j = step; j < s.length(); j += step) {
                // 단위에 맞게 잘라낸 현재 문자열
                int end = Math.min(j + step, s.length());
                String current = s.substring(j, end);

                // 이전 문자열과 같으면 count 증가
                if (prev.equals(current)) {
                    count++;
                } else {
                    // 이전 문자열과 다르면 compressed에 추가
                    if (count > 1) compressed += count + prev; // 반복 횟수가 2회 이상이면, 반복횟수+문자열 을 붙이고,
                    else compressed += prev; // 반복 횟수가 1회이면(즉, 1번만 나온 문자열), 문자열 만 붙인다.
                    prev = current;
                    count = 1;
                }
            }

            // 마지막에 자른 문자열이 이전 문자열과 동일한 경우, count만 더하고 compressed에는 반영되지 않음. -> 반복문 종료 후 따로 처리해야 함.
            if (count > 1) compressed += count + prev;
            else compressed += prev;

            // 가장 짧은 길이 갱신
            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }

    public static void main(String[] args) {
        String test = "aabbaccc";
        System.out.println(solution(test)); // 출력: 6
    }
}
