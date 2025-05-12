package week_06;

public class PGS_피보나치수 {
    static int[] memo;

    public int solution(int n) {
        memo = new int[n + 1];

        // 초기화: -1로 설정하여 계산되지 않은 상태를 표시
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        return fib(n);
    }

    private int fib(int n) {
        final int MOD = 1234567;

        if (n == 0) return 0;
        if (n == 1) return 1;

        // 이미 계산한 값이 있으면 반환
        if (memo[n] != -1) return memo[n];

        // 계산 후 메모에 저장하고 반환
        memo[n] = (fib(n - 1) + fib(n - 2)) % MOD;
        return memo[n];
    }
}
