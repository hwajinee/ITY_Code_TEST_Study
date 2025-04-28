package week_04.seraching;

import java.util.HashSet;
import java.util.Set;

public class PGS_소수찾기 {
//    public static void main(String[] args) {
//        int answer = solution("011");
//        System.out.println(answer);
//    }
//
//    public static int solution(String numbers) {
//        int answer = 0;
//
//        // 1. 만들 수 있는 모든 경우의 수 만들기
//        // 2. 해당 수를 parseInt해서 숫자형으로 만들기
//        // 3. 소수인지 여부 판별하기
//        // 4. 소수인 수일 때, count++하기
//
//        // array에 numbers 각각 요소로 저장
//        Character[] array = new Character[numbers.length()];
//        for (int i = 0; i < numbers.length(); i++) {
//            array[i] = numbers.charAt(i);
//        }
//
//        Set<Integer> allKinds = new HashSet<>();
//
//        // 모든 경우의 수 만들기
//        makePermutation(numbers,"",allKinds);
//
//        for (int num : allKinds){
//            if (isPrime(num)){
//                answer++;
//            }
//        }
//        return answer;
//    }
//
//    public static void makePermutation(String remaining, String current, Set<Integer> allKinds) {
//        if (remaining.length() == 0) { // base case
//            // 순열이 하나 완성되었으면 Set에 추가
//            allKinds.add(Integer.parseInt(current));
//            return;
//        }
//
//        for (int i = 0; i < remaining.length(); i++) {
//            // remaining에서 i번째 문자를 선택하여 current에 추가하고, 나머지 문자로 재귀 호출
//            makePermutation(remaining.substring(0, i) + remaining.substring(i + 1), current + remaining.charAt(i), allKinds);
//        }
//    }
//
//    public static boolean isPrime(int num){
//        if (num <= 1) return false;
//        for (int i = 2; i <= Math.sqrt(num) ; i++) {
//            if (num ==2) return true;
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
