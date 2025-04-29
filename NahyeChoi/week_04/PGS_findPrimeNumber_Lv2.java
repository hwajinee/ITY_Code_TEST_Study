package week_04;

import java.util.HashSet;

public class PGS_findPrimeNumber_Lv2 {
//    PGS 소수 찾기 lv2
    class Solution {
        public int solution(String numbers) {
            // 소수 저장 및 중복 제거를 위해 Set 선언
            HashSet<Integer> primes = new HashSet<>();

            // 백트래킹 사용
            backtrack(numbers, "", primes);


            // 결과 반환: 중복을 제거한 소수의 개수
            return primes.size();
        }

        // 백트래킹을 통해 조합
        public void backtrack(String numbers, String current, HashSet<Integer> primes) {
            // current가 비어 있지 않으면 소수 체크
            if (!current.isEmpty()) {
                int num = Integer.parseInt(current);
                if (isPrime(num)) {
                    primes.add(num);  // 소수이면 Set에 추가
                }
            }

            // 문자 하나씩 뽑아서 재귀 호출
            for (int i = 0; i < numbers.length(); i++) {
                // 사용한 문자는 다시 사용하지 않도록
                String next = current + numbers.charAt(i);
                String remaining = numbers.substring(0, i) + numbers.substring(i + 1);
                backtrack(remaining, next, primes); // 재귀호출
            }
        }

        // 소수 판별 함수
        public boolean isPrime(int n) {
            if (n <= 1) return false;  // 1은 소수가 아님
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;  // 나눠지면 소수가 아님
            }
            return true;  // 소수일 경우
        }
    }
}
