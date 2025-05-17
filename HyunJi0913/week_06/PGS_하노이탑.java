package week_06;
import java.util.*;

// 하노이 탑 이동 규칙:
// 1. n-1개를 시작 → 보조
// 2. 가장 큰 원판 1개를 시작 → 목표
// 3. n-1개를 보조 → 목표

public class PGS_하노이탑 {
    List<int[]> moves = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);  // from: 1, to: 3, via: 2
        return moves.toArray(new int[moves.size()][]);
    }

    private void hanoi(int n, int from, int to, int via) {
        if (n == 1) {
            moves.add(new int[]{from, to});
            return;
        }

        hanoi(n - 1, from, via, to);  // 1단계
        moves.add(new int[]{from, to});  // 2단계
        hanoi(n - 1, via, to, from);  // 3단계
    }
}
