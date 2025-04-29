package week_04;

public class PGS_findPrimeNumber_Lv1 {
//    PGS 소수찾기 lv1
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];

        for (int i = 2; i <= n; i++){
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i] != 0) { answer++; }
            for (int j = i+i; j <= n; j+=i){
                arr[j] = 0;
            }
        }

        return answer;
    }
}
}
